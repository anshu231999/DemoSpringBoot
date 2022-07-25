// Java Program to Illustrate DemoApplication

// Importing package module to code
package com.anshu.practice;
// Importing required classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Annotation
@SpringBootApplication
@ComponentScan ({"com.anshu","com.anshu.controller"})

// Main class
public class App {

	// Main driver method
	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
		System.out.println("Hello Anshu");
		
	}
}
