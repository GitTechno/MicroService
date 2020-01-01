package com.nt.test;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.test.beans.DateUtils;

@SpringBootApplication
public class SbAppApplication {

	

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SbAppApplication.class, args);
		DateUtils utils=ctx.getBean("sysDate",DateUtils.class);
		System.out.println(utils.getTodayDate());
	}

}
