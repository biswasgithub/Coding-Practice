package com.datetime;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class TestDateTime {
	

	private static Date stringToDate(String str) {
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
		date = dateFormat1.parse(str);
		}
		catch(ParseException e) {
			
		}
		return date;
	} 
	
	private static String dateToString(Date date) {
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		String str=null;
		str = dateFormat1.format(date);
		return str;
	} 
	
	public static void main(String[] args) {
		
		//convert String to java.util.date and Date to string
		// String -> Date : SimpleDateFormat.parse(String);
		String startDate="31/10/2020";
		System.out.println("String To Date: "+ stringToDate(startDate));
		System.out.println("Date To String: "+ dateToString(new Date()));


		
		//DateTimeFormatter for LocalDate and LocalDate to string
		LocalDate today = LocalDate.now();
		//System.out.println(dateFormat.format(today)); // throw  java.lang.IllegalArgumentException
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = today.format(dtf2);		 
		System.out.println("\nLocalDate Format: "+formattedDate);
		
		//TimeStamp 
		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		System.out.println("\nTime Stamp:  "+ timeStamp );
        
		//TimeStamp to LocalDate
        LocalDate timeStampToLocalDate= timeStamp.toLocalDateTime().toLocalDate();
        
        System.out.println("TimeStamp To LocalDate: "+ timeStampToLocalDate);
        String str2=dtf2.format(timeStampToLocalDate);
        System.out.println("Formatting Localdate: "+ str2);
        		
		Instant instant = timeStamp.toInstant();
        System.out.println(instant);
        LocalDate localDate 
        = LocalDateTime.ofInstant(instant, ZoneOffset.UTC).toLocalDate();
        System.out.println(localDate);
	}
}
