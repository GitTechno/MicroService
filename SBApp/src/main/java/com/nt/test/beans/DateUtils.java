package com.nt.test.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sysDate")
public class DateUtils {
	
	@Autowired
	private Date date;
	
	public Date getTodayDate() {
		System.out.println("Todays Date is this is"+date);
		return date;
	}

}
