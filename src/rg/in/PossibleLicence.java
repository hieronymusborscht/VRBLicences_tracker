package rg.in;

import java.util.Arrays;

import org.apache.commons.validator.routines.EmailValidator;

public class PossibleLicence {

	private static org.apache.commons.validator.routines.EmailValidator ev;
	private String[] fields;

	
	public void setField(String value, int index){
		if(index<fields.length){
			fields[index] = value;
		}
	}

	public PossibleLicence(){
		ev = EmailValidator.getInstance(false);
		fields = new String[38];
		
		fields[0]="licence_number";
		fields[1]="licence_type";
		fields[2]="licence_sub_type";
		fields[3]="establishment_name";
		fields[4]="establishment_type";
		fields[5]="address_1";
		fields[6]="address_2";
		fields[7]="city";
		fields[8]="postal_code";
		fields[9]="mailing_address_1";
		fields[10]="mailing_address_2";
		fields[11]="mailing_city";
		fields[12]="mailing_province";
		fields[13]="mailing_postal_code";
		fields[14]="mailing_country";
		fields[15]="phone_number";
		fields[16]="fax_number";
		fields[17]="local_government";
		fields[18]="regional_district";
		fields[19]="licensee";
		fields[20]="third_party_operator";
		fields[21]="issue_date";
		fields[22]="expiry_date";
		fields[23]="capacity";
		fields[24]="monday_open";
		fields[25]="monday_close";
		fields[26]="tuesday_open";
		fields[27]="tuesday_close";
		fields[28]="wednesday_open";
		fields[29]="wednesday_close";
		fields[30]="thursday_open";
		fields[31]="thursday_close";
		fields[32]="friday_open";
		fields[33]="friday_close";
		fields[34]="saturday_open";
		fields[35]="saturday_close";
		fields[36]="sunday_open";
		fields[37]="sunday_close";
	}
	/*
	public void setLicence_number(String s){ fields[0]=s; }
	public void setLicence_type(String s){ fields[1]=s;}
	public void setLicence_sub_type(String s){ fields[2]=s; }
	public void setEstablishment_name(String s){fields[3]=s; }
	public void setEstablishment_type(String s){fields[4]=s;}
	public void setAddress_1(String s){fields[5]=s; }
	public void setAddress_2(String s){fields[6]=s; }
	public void setCity(String s){fields[7]=s;}
	public void setPostal_code(String s){ fields[8]=s;}
	public void setMailing_address_1(String s){fields[9]=s;}
	public void setMailing_address_2(String s){fields[10]=s;}
	public void setMailing_city(String s){fields[11]=s;}
	public void setMailing_province(String s){fields[12]=s;}
	public void setMailing_postal_code(String s){fields[13]=s;}
	public void setMailing_country(String s){ fields[14]=s;}
	public void setPhone_number(String s){ fields[15]=s;}
	public void setFax_number(String s){ fields[16] = cleanupPhone(s);}
	public void setLocal_government(String s){fields[17]=s;}
	public void setRegional_district(String s){fields[18]=s;}
	public void setLicensee(String s){fields[19]=s; }
	public void setThird_party_operator(String s){fields[20]=s;}
	public void setIssue_date(String s){fields[21]=s; }
	public void setExpiry_date(String s){ fields[22]=s;}
	public void setCapacity(String s){ fields[23]=s; }
	public void setMonday_open(String s){ fields[24]=s;}
	public void setMonday_close(String s){ fields[25]=s;}
	public void setTuesday_open(String s){ fields[26]=s;}
	public void setTuesday_close(String s){fields[27]=s;}
	public void setWednesday_open(String s){fields[28]=s;}
	public void setWednesday_close(String s){ fields[29]=s;}
	public void setThursday_open(String s){fields[30]=s;}
	public void setThursday_close(String s){fields[31]=s;}
	public void setFriday_open(String s){fields[32]=s;}
	public void setFriday_close(String s){fields[33]=s;}
	public void setSaturday_open(String s){fields[34]=s;}
	public void setSaturday_close(String s){fields[35]=s;}
	public void setSunday_open(String s){fields[36]=s;}
	public void setSunday_close(String s){fields[37]=s;}	
	*/
	
	public String getLicence_number(){ return fields[0]; }
	public String getLicence_type(){ return fields[1];}
	public String getLicence_sub_type(){return fields[2]; }
	public String getEstablishment_name(){return fields[3]; }
	public String getEstablishment_type(){return fields[4];}
	public String getAddress_1(){return fields[5]; }
	public String getAddress_2(){return fields[6]; }
	public String getCity(){return fields[7];}
	public String getPostal_code(){ return fields[8];}
	public String getMailing_address_1(){return fields[9];}
	public String getMailing_address_2(){return fields[10];}
	public String getMailing_city(){return fields[11];}
	public String getMailing_province(){return fields[12];}
	public String getMailing_postal_code(){return fields[13];}
	public String getMailing_country(){return fields[14];}
	public String getPhone_number(){ return fields[15];}
	public String getFax_number(){return fields[16];}
	public String getLocal_government(){return fields[17];}
	public String getRegional_district(){return fields[18];}
	public String getLicensee(){return fields[19]; }
	public String getThird_party_operator(){return fields[20];}
	public String getIssue_date(){return fields[21]; }
	public String getExpiry_date(){return fields[22];}
	public String getCapacity(){ return fields[23]; }
	public String getMonday_open(){ return fields[24];}
	public String getMonday_close(){ return fields[25];}
	public String getTuesday_open(){return fields[26];}
	public String getTuesday_close(){return fields[27];}
	public String getWednesday_open(){return fields[28];}
	public String getWednesday_close(){ return fields[29];}
	public String getThursday_open(){return fields[30];}
	public String getThursday_close(){return fields[31];}
	public String getFriday_open(){return fields[32];}
	public String getFriday_close(){return fields[33];}
	public String getSaturday_open(){return fields[34];}
	public String getSaturday_close(){return fields[35];}
	public String getSunday_open(){return fields[36];}
	public String getSunday_close(){return fields[37];}	
	
	public String makeInsert(){
		StringBuffer sb = new StringBuffer();
		sb.append("");
		
		
		sb.append("insert into Liquor_licence (");
		sb.append("licence_number,		licence_type,		licence_sub_type,	establishment_name,");
		sb.append("establishment_type, address_1,			address_2,city,		postal_code,");
		sb.append("mailing_address_1,  mailing_address_2,  mailing_city, 		mailing_province,");
		sb.append("mailing_postal_code,mailing_country,	phone_number, 		fax_number,");
		sb.append("local_government,	regional_district,  licensee,			third_party_operator,");
		sb.append("issue_date,			expiry_date,		monday_open,		monday_close,");
		sb.append("tuesday_open, 		tuesday_close,		wednesday_open,		wednesday_close,");
		sb.append("thursday_open,		thursday_close, 	friday_open,		friday_close,");
		sb.append("saturday_open,		saturday_close,  	character,			sunday_open, ");
		sb.append("sunday_close");
		sb.append(") values (");
				
		if(fields[0]!=null){ sb.append("'"); sb.append(fields[0]); sb.append("',"); }
		if(fields[1]!=null){ sb.append("'"); sb.append(fields[1]); sb.append("',"); }
		if(fields[2]!=null){ sb.append("'"); sb.append(fields[2]); sb.append("',"); }
		if(fields[3]!=null){ sb.append("'"); sb.append(fields[3]); sb.append("',"); }
		if(fields[4]!=null){ sb.append("'"); sb.append(fields[4]); sb.append("',"); }
		if(fields[5]!=null){ sb.append("'"); sb.append(fields[5]); sb.append("',"); }
		if(fields[6]!=null){ sb.append("'"); sb.append(fields[6]); sb.append("',"); }
		if(fields[7]!=null){ sb.append("'"); sb.append(fields[7]); sb.append("',"); }
		if(fields[8]!=null){ sb.append("'"); sb.append(fields[8]); sb.append("',"); }
		if(fields[9]!=null){ sb.append("'"); sb.append(fields[9]); sb.append("',"); }
		if(fields[10]!=null){ sb.append("'"); sb.append(fields[10]); sb.append("',"); }
		if(fields[11]!=null){ sb.append("'"); sb.append(fields[11]); sb.append("',"); }
		if(fields[12]!=null){ sb.append("'"); sb.append(fields[12]); sb.append("',"); }
		if(fields[13]!=null){ sb.append("'"); sb.append(fields[13]); sb.append("',"); }
		if(fields[14]!=null){ sb.append("'"); sb.append(fields[14]); sb.append("',"); }
		if(fields[15]!=null){ sb.append("'"); sb.append(fields[15]); sb.append("',"); }
		if(fields[16]!=null){ sb.append("'"); sb.append(fields[16]); sb.append("',"); }
		if(fields[17]!=null){ sb.append("'"); sb.append(fields[17]); sb.append("',"); }
		if(fields[18]!=null){ sb.append("'"); sb.append(fields[18]); sb.append("',"); }
		if(fields[19]!=null){ sb.append("'"); sb.append(fields[19]); sb.append("',"); }
		if(fields[20]!=null){ sb.append("'"); sb.append(fields[20]); sb.append("',"); }
		if(fields[21]!=null){ sb.append("'"); sb.append(fields[21]); sb.append("',"); }
		if(fields[22]!=null){ sb.append("'"); sb.append(fields[22]); sb.append("',"); }
		if(fields[23]!=null){ sb.append("'"); sb.append(fields[23]); sb.append("',"); }
		if(fields[24]!=null){ sb.append("'"); sb.append(fields[24]); sb.append("',"); }
		if(fields[25]!=null){ sb.append("'"); sb.append(fields[25]); sb.append("',"); }
		if(fields[26]!=null){ sb.append("'"); sb.append(fields[26]); sb.append("',"); }
		if(fields[27]!=null){ sb.append("'"); sb.append(fields[27]); sb.append("',"); }
		if(fields[28]!=null){ sb.append("'"); sb.append(fields[28]); sb.append("',"); }
		if(fields[29]!=null){ sb.append("'"); sb.append(fields[29]); sb.append("',"); }
		if(fields[30]!=null){ sb.append("'"); sb.append(fields[30]); sb.append("',"); }
		if(fields[31]!=null){ sb.append("'"); sb.append(fields[31]); sb.append("',"); }
		if(fields[32]!=null){ sb.append("'"); sb.append(fields[32]); sb.append("',"); }
		if(fields[33]!=null){ sb.append("'"); sb.append(fields[33]); sb.append("',"); }
		if(fields[34]!=null){ sb.append("'"); sb.append(fields[34]); sb.append("',"); }
		if(fields[35]!=null){ sb.append("'"); sb.append(fields[35]); sb.append("',"); }
		if(fields[36]!=null){ sb.append("'"); sb.append(fields[36]); sb.append("',"); }
		if(fields[37]!=null){ sb.append("'"); sb.append(fields[37]); sb.append("'"); }
		sb.append(")");
		return sb.toString();
	}

	
	public int getIndexFromName(String field){
		int i=0;
		try{
			i=java.util.Arrays.asList(fields).indexOf(field);
		}catch(Exception e){
			System.out.println("getIndexFromName: "+e);
		}
		return i;
	}
	public static String capitolizeName(String s){
		return org.apache.commons.lang3.text.WordUtils.capitalizeFully(s);
	}
	public static String cleanupPhone(String s){
		return  s.replaceAll("[^0-9+]", "");
	}
	public static boolean isThisAnEmail(String s){
		return ev.isValid(s);
	}
	public boolean validate(){	if(fields[0]==null || fields[0].length()<1 ){	return false;	}	return true;}
	
	/*
	 * 
	 * 
create table Liquor_licence (
licence_number integer PRIMARY KEY not null, 
licence_type character varying(50) not null default '',
licence_sub_type character varying(50) not null default '',
establishment_name character varying(256) not null default '',
establishment_type character varying(256) not null default '',
address_1 character varying(256) not null default '',
address_2 character varying(256) not null default '',
city  character varying(256) not null default '',
postal_code  character varying(12) not null default '',
mailing_address_1  character varying(256) not null default '',
mailing_address_2 character varying(256) not null default '',
mailing_city character varying(256) not null default '',
mailing_province character varying(30) not null default '',
mailing_postal_code character varying(12) not null default '',
mailing_country character varying(30) not null default '',
phone_number character varying(15) not null default '',
fax_number character varying(15) not null default '',
local_government character varying(256) not null default '',
regional_district character varying(256) not null default '',
licensee character varying(256) not null default '',
third_party_operator character varying(256) not null default '',
issue_date date,
expiry_date date,
capacity integer not null default '0',
monday_open character varying(30) not null default '',
monday_close character varying(30) not null default '',
tuesday_open character varying(30) not null default '',
tuesday_close character varying(30) not null default '',
wednesday_open character varying(30) not null default '',
wednesday_close character varying(30) not null default '',
thursday_open character varying(30) not null default '',
thursday_close character varying(30) not null default '',
friday_open character varying(30) not null default '',
friday_close character varying(30) not null default '',
saturday_open character varying(30) not null default '',
saturday_close character varying(30) not null default '',
sunday_open character varying(30) not null default '',
sunday_close character varying(30) not null default '')
	 * 
	 * 
	 * 
	 */
	
	
}
