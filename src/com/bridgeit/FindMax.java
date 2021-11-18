package com.bridgeit;

public class FindMax {

	//Given 3 Integers find the maximum

	public Integer getMaxIntValue(Integer num1, Integer num2, Integer num3) {
		
		Integer max = num1;

		if (max.compareTo(num2) < 0) {
			max = num2;

		} else if (max.compareTo(num3) < 0) {
			max=num3;
		}
		return max;

	}
	
	