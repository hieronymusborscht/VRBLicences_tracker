package rg.in;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileParser {
	
	private static int[] map;
	
	/*
	private HashMap<String, PossibleLead> finalist_list;
	private String contact_id;
	private String[] groups;
	private int[] map;
	private static StringBuffer errorBuffer;
	private static org.apache.commons.validator.routines.EmailValidator ev;
	*/
	
	
	/*public static java.util.ArrayList<LicenceRecord> readFile(java.io.InputStream in){
		readFile(java.io.InputStream in);
		return new java.util.ArrayList<LicenceRecord>();
	}*/
	
	
	public static void readFile(java.io.InputStream in){
		//String csvFile = "/Users/john/Documents/adhoc-june.csv";
		HashMap<String, PossibleLicence> possible_licences = new HashMap<String, PossibleLicence>();
		PossibleLicence pl = new PossibleLicence();
		BufferedReader br = null;
		
		String line = "";
		try {
			int number_of_nodes =0;
			//br = new BufferedReader(new FileReader(csvFile));
			br = new BufferedReader(new InputStreamReader(in));
			
			while ((line = br.readLine()) != null) {
				//String[] nodes = line.split(",");
				String[] nodes = customSplitSpecific(line);
				
				//if(nodes.length!=38){
					System.out.println("["+nodes.length+"]"+line); 
					//}
				/*if(number_of_nodes==0){ // this block will only be called once
					number_of_nodes = nodes.length;
					map = new int[number_of_nodes];
					System.out.println("nodes.length"+nodes.length);
					for(int i=0; i<number_of_nodes; i++){       
						map[i]=pl.getIndexFromName(nodes[i].trim());    
					}
					System.out.println(line);	
				}else{  // this block gets called every time after the first
					for(int i=0; i<nodes.length; i++){
						if(nodes.length!=38 && i==0){ System.out.println("["+nodes.length+"]"); }
						//pl.setField(nodes[i].trim(), map[i]);
					}
					//possible_licences.put(pl.getLicence_number(),pl);
				}*/
			}
			System.out.println("possible_licences.size()");
			System.out.println(possible_licences.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

	
	public static String[] customSplitSpecific(String s)
	{
	    ArrayList<String> words = new ArrayList<String>();
	    boolean notInsideComma = true;
	    int start =0, end=0;
	    for(int i=0; i<s.length()-1; i++)
	    {
	        if(s.charAt(i)==',' && notInsideComma)
	        {
	            words.add(s.substring(start,i));
	            start = i+1;                
	        }   
	        else if(s.charAt(i)=='"')
	        notInsideComma=!notInsideComma;
	    }
	    words.add(s.substring(start));
	    //return words;
	 String[] s_arr=   (String[]) words.toArray(new String[words.size()]);
	    return s_arr;
	} 
	
	
	
	
	
}
