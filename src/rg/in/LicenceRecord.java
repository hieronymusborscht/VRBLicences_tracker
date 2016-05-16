package rg.in;

public class LicenceRecord {
	
	public LicenceRecord(){
		field_names = new String[38];
		
		
		field_names[0]="licence_number";	
		field_names[1]="licence_type"; 
		field_names[2]="licence_sub_type"; 
		field_names[3]="establishment_name";	
		field_names[4]="establishment_type";	
		field_names[5]="address_1"; //	character varying(256) not null default '',
		field_names[6]="address_2"; //	character varying(256) not null default '',
		field_names[7]="city character"; //	 varying(256) not null default '',
		field_names[8]="postal_code"; //		character  varying(10) not null default '',
		field_names[9]="mailing_address_1"; //	 character varying(256) not null default '',
		field_names[10]="mailing_address_2"; //	 character varying(256) not null default '',
		field_names[11]="mailing_city"; //	 character varying(256) not null default '',
		field_names[12]="mailing_province"; //	 character varying(256) not null default '',
		field_names[13]="mailing_postal_code"; //		character varying(10) not null default '',
		field_names[14]="mailing_country"; //		character varying(256) not null default '',
		field_names[15]="phone_number"; //	 character varying(60) not null default '',
		field_names[16]="fax_number"; //		character varying(60) not null default '',
		field_names[17]="local_government"; //	 character varying(256) not null default '',
		field_names[18]="regional_district"; //	 character varying(256) not null default '',
		field_names[19]="licensee"; //	 character varying(256) not null default '',	
		field_names[20]="third_party_operator"; //	 character varying(256) not null default '',
		field_names[21]="issue_date"; //	 date,	
		field_names[22]="expiry_date"; //		date,
		field_names[23]="capacity"; //	 integer not null default '0',	
		field_names[24]="monday_open"; //		time with time zone,
		field_names[25]="monday_close"; //	 time with time zone,	
		field_names[26]="tuesday_open"; //	 time with time zone,
		field_names[27]="tuesday_close"; //	 time with time zone,
		field_names[28]="wednesday_open"; //		time with time zone,
		field_names[29]="wednesday_close"; //		time with time zone,
		field_names[30]="thursday_open"; //	 time with time zone,	
		field_names[31]="thursday_close"; //		time with time zone,
		field_names[32]="friday_open"; //		time with time zone,
		field_names[33]="friday_close"; //	 time with time zone,	
		field_names[34]="saturday_open"; //	 time with time zone,	
		field_names[35]="saturday_close"; //		time with time zone,
		field_names[36]="sunday_open"; //		time with time zone,
		field_names[37]="sunday_close"; //	 time with time zone
				
		
		
		
		
		
		
	}
	
	
	public String[] field_names;
	
	public int getIndexFromName(String field){
		return java.util.Arrays.asList(field_names).indexOf(field);
	}

}
