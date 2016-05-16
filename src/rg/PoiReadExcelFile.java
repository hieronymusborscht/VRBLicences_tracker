package rg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import rg.in.PossibleLicence;

public class PoiReadExcelFile {
	
	private static PossibleLicence  pl = null;
	private static HashMap<String, PossibleLicence> possible_licences =null;
	
	public static void main(String[] args) {
		pl = new PossibleLicence();
		possible_licences = new HashMap<String, PossibleLicence>();
		parseExcelfile();			
	}
	

	public static int[] doTheIndex(String[] nodes){
		int number_of_nodes = nodes.length;
		int[] map = new int[number_of_nodes];
		for(int i=0; i<number_of_nodes; i++){      
			map[i]=pl.getIndexFromName(nodes[i]);
		}
		return map;
	}
	

	private static String[] parseRow(HSSFRow row1){
		HSSFCell cellA = null;
		int first_cell  = row1.getFirstCellNum();
		int last_cell = row1.getLastCellNum();
		String[] array_l = new String[last_cell]; 
		for(int i=first_cell; i<last_cell; i++){
			cellA = row1.getCell(i,HSSFRow.CREATE_NULL_AS_BLANK);			
			array_l[i] = cellA.getStringCellValue();
		}
		return array_l;
	}
	private static void makeObject(String[] data_arr, int[] map_arr){
		PossibleLicence pl0 =new PossibleLicence();
		for(int i=0; i< map_arr.length; i++){
			if(i<data_arr.length){
				pl0.setField( data_arr[i].trim(), map_arr[i]);
			}
		}
		possible_licences.put(pl0.getLicence_number(),pl0);
	}
	public static void parseExcelfile(){
		try{
			FileInputStream fileInputStream = new FileInputStream("/Users/john/Downloads/adhocjune.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet("first");
			int first_row = worksheet.getFirstRowNum();
			int last_row = worksheet.getLastRowNum();
			String[] index_arr;
			String[] row_arr;
			int[] map = null;
			for(int i=first_row; i<last_row; i++){		
				if(i==first_row){				
					index_arr = parseRow(worksheet.getRow(i));
					map = doTheIndex(index_arr);
				}else{
					row_arr = parseRow(worksheet.getRow(i));
					makeObject(row_arr, map);
				}
			}
			
			writeToDataBase(possible_licences);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToDataBase(HashMap<String, PossibleLicence> possible_licences){
		//System.out.println("length of PossibleLicences HashMap "+possible_licences.size());
		String[] inserts = new String[50];
		int inserts_index=0;
		
		java.util.ArrayList<PossibleLicence> values_al = new java.util.ArrayList<PossibleLicence>();
		values_al.addAll((AbstractCollection<PossibleLicence>)possible_licences.values());
		System.out.print(values_al.size());
		/*for(int i=0; i<values.size(); i++){
			PossibleLicence pl = values.get(i);
			inserts[inserts_index]=pl.makeInsert();

			inserts_index++;
			if(inserts_index>49){
				
			}	
		}*/	
	}
	
	
	
	
	
}