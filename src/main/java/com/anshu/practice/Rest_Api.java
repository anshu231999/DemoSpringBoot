package com.anshu.practice;


import java.io.IOException;

import java.sql.Timestamp;
//import java.sql.Timestamp;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshu.controller.Request;
import com.anshu.controller.Validate;



@RestController
@RequestMapping("/schedule")
public class Rest_Api {
	
	
	
	
//	//@Autowired
//	//Validate vali;
	
	 @PostMapping("/new")
     public String solve(@RequestHeader Map<String,String>mp,@RequestBody Request req)
	{
		   
		 System.out.println(mp.get("auth_key"));
		   
		   return "Hi";
	}
////		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
////		String time="2022-07-18 16:40:00";
////		LocalDateTime lt = LocalDateTime.from(f.parse(time));
////		 System.out.println(lt);
////		 System.out.println(LocalDateTime.now()+"--------");
////		 
////		 
////		  // DateTimeFormatter fr=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
////		    
////		   // System.out.println(time.replace(' ', 'T'));
////		   // LocalDateTime ldt=LocalDateTime.parse(time);
////		    //System.out.println(ldt);
////		 
////		    LocalDateTime localDateTime = LocalDateTime.now();
////	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
////	        String formatDateTime = localDateTime.format(formatter);
////	        System.out.println(formatDateTime+"*********");
////	        
////	        
////	        
////	        Timestamp ts= Timestamp.valueOf(formatDateTime);
////	        System.out.println(ts+"//////////");
////	        
////	        
////	        LocalDateTime localDateTime1 = LocalDateTime.parse(time.replace(" ", "T"));
////            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
////            String formatDateTime1 = localDateTime1.format(formatter1);
////            System.out.println(formatDateTime1+"++++++++++");
////            System.out.println(Timestamp.valueOf(LocalDateTime.parse(formatDateTime1.replace(" ", "T"))));
////            System.out.println(Timestamp.valueOf(LocalDateTime.parse(formatDateTime1.replace(" ", "T"))).toString().replace(".0", ""));
////	        
////	        
//////		if(lt.isBefore(LocalDateTime.now()))
//////		  System.out.println("Hello");
//////		else
//////			System.out.println("Are you there");
////		return "Hi";
	
		
	
	
	
}
	
	
	
	


