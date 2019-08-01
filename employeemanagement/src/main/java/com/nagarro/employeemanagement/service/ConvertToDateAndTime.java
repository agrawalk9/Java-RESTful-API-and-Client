package com.nagarro.employeemanagement.service;

import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertToDateAndTime {

	public static Date convertToDate(String str) {
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("dd-mm-yyyy").parse(str);
			} catch (ParseException e) {
				System.out.print("date is not parsable");
			}
			return date1;
	}

	public static Time convertToTime(String str) {
		StringBuffer time = new StringBuffer();
		time.append(str.charAt(0) + str.charAt(1));
		time.append(str.charAt(0));
		time.append(str.charAt(1));
		time.append(":");
		time.append(str.charAt(2));
		time.append(str.charAt(3));
		time.append(":00");
		str = time.toString();
		return Time.valueOf(str);
	}
}
