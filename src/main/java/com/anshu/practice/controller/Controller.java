package com.anshu.practice.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class Controller {
	@PostMapping("/new")
	public String testing(@RequestBody Map<String,Object>map) {
		System.out.println("helllllo");
		System.out.println(map);
		//System.out.println(map.get("name"));
		//System.out.println(map.get("company"));
		System.out.println(map.get("Address"));
		Map<?,?>mapp= (Map<?,?>)map.get("Address");
		System.out.println(mapp.get("area"));
		String json="{\"car\":\"BMW\",\"Price\":\"1 Cr\"}";
		System.out.println(json);
		
		
		return "Testing under progress";
	}
	
	@GetMapping("/new")
	public String getMapping() {
		return "GET Request";
	}
	@PostMapping(value="/hello",consumes= MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Response postData(@RequestHeader Map<String,String>mp,Request req) throws Exception {
		System.out.println(req.toString());
		System.out.println(mp);
		Response res=null;
		res= new Response(400,"Form Data");
		return res;
	}

}
