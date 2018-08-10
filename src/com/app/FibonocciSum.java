package com.app;

public class FibonocciSum {

	public static void fiboseries(int num){
		
		int n1=0;int n2=1,n3=0;int sum=1;
		System.out.print(n1+" "+n2+" ");
		while(num>0){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		sum=sum+n3;
		
		num=num-1;
		System.out.print(n3+" ");
		}System.out.println();
		System.out.println("fibonocci sum is:"+sum);
		
	}
	
	public static void main(String[] args) {
		
		fiboseries(4);
	}
}
