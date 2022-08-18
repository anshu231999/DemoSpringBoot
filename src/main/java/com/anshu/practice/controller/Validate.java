package com.anshu.practice.controller;

import org.springframework.stereotype.Component;

@Component
public class Validate {
      public boolean check(String msg)
      {
    	  if(msg.length()>0)
    		  return true;
    	  else
    	  return false;
      }
}
