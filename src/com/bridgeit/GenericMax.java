package com.bridgeit;

public class GenericMax<T extends Comparable<T>> {
	
	private T num1;
	private T num2;
	private T num3;
	
	public GenericMax (){
		
	}
	
	public GenericMax (T num1,T num2,T num3){
		
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
				
	}
	
	public  T testMaximum() {
		return getMaxValue(this.num1,this.num2,this.num3);
	}
	
	private static <T extends Comparable<T>>  T getMaxValue (T num1, T num2, T num3) {
		
		T max = num1;

		if (max.compareTo(num2) < 0) {
			max = num2;

		} else if (max.compareTo(num3) < 0) {
			max=num3;
		}
		return max;

	}

}
