package com.anshu;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Calculator {
	
	
	int doSum(int a,int b) {
	 return a+b;
	}
	
	
	int doProduct(int a,int b,int c) {
		return a*b*c;
	}
	
	
	@Test
	void testSum() {
		assertThat(doSum(12,5)).isEqualTo(18);
		
	}
	
	

}
