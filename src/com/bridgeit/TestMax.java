package com.bridgeit;

import org.junit.Assert;
import org.junit.Test;

class TestMax {
	
	
		
	//Test cases for integer
	
	@Test
	public void maxFirstIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum1= findMax.getMaxValue(101, 30, 70);
		Assert.assertEquals(101, maxNum1);
	}
	
	@Test
	public void maxSecondIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum2= findMax.getMaxValue(101, 200, 70);
		Assert.assertEquals(101, maxNum2);
	}
	
	@Test
	public void maxThirdIntegerTest() {
		FindMax findMax = new FindMax();
		int maxNum3= findMax.getMaxValue(101, 30, 300);
		Assert.assertEquals(101, maxNum3);
	}



	//Test cases for double

	@Test
	public void maxFirstDoubleTest() {
		FindMax findMax = new FindMax();
		double maxNum1= findMax.getMaxValue(101.67, 30.30, 70.87);
		Assert.assertEquals(101.67, maxNum1);
	}
	
	@Test
	public void maxSecondDoubleTest() {
		FindMax findMax = new FindMax();
		double maxNum2= findMax.getMaxValue(101.86, 200.87, 70.31);
		Assert.assertEquals(101, maxNum2);
	}
	
	@Test
	public void maxThirdDoubleTest() {
		FindMax findMax = new FindMax();
		double maxNum3= findMax.getMaxValue(101.44, 30.66, 300.45);
		Assert.assertEquals(101, maxNum3);
	}
	
	//Test cases for string
	
	@Test
	public void maxFirstStringTest() {
		FindMax findMax = new FindMax();
		String max1= findMax.getMaxValue("vdgvgveg", "wx", "edd");
		Assert.assertEquals(101, max1);
	}
	
	@Test
	public void maxSecondStringTest() {
		FindMax findMax = new FindMax();
		String max2= findMax.getMaxValue("vdgvgveg", "wxtytytyttuytuytu", "edd");
		Assert.assertEquals(101, max2);
	}
	
	@Test
	public void maxThirdStringTest() {
		FindMax findMax = new FindMax();
		String max3= findMax.getMaxValue("vdgvgveg", "wx", "eddguygyyguguyguyguyguygugu");
		Assert.assertEquals(101, max3);
	}


	
	