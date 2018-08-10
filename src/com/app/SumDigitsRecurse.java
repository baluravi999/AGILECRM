package com.app;

public class SumDigitsRecurse {
	 static int rem=0; static  int sum=0;
	public static void getSumDigit(int num){
		
		
		if(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		
	}getSumDigit(num);
	System.out.print(sum);
		}
	public static void main(String[] args) {
		//int x=121;
		getSumDigit(121);
	}
	
}
