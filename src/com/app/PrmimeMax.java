package com.app;

public class PrmimeMax {
 
   public void printPrimeNumbers(int max){
	  
	   for(int i=2;i<max;i++){
		   boolean flag=true;
		   for(int j=2;j<i;j++){
			   if(i%j==0){
				   flag=false;
				   break;
			      }
			     
		   }if(flag==true){
			   System.out.print(i+" ");
		              }
		   
	   }//for
   }//method
   
   public static void main(String[] args) {
	
	   PrmimeMax p=new PrmimeMax();
	   p.printPrimeNumbers(40);
	   
}//main
   
}//class
