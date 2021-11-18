package com.bridgeit;

import org.junit.Assert;
import org.junit.Test;

class TestMax {
	
	
		

	
	@Test
	public void maxFirstIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum1= findMax.getMaxIntValue(101, 30, 70);
		Assert.assertEquals(101, maxNum1);
	}
	
	@Test
	public void maxSecondIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum2= findMax.getMaxIntValue(101, 200, 70);
		Assert.assertEquals(101, maxNum2);
	}
	
	@Test
	public void maxThirdIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum3= findMax.getMaxIntValue(101, 30, 300);
		Assert.assertEquals(101, maxNum3);
	}
	