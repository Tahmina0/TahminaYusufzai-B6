package com.noorteck.java.hw8;

public class SumofEvenOdd {



	public static void main(String[] args) {
	 
	    int sumOdd = 0;
	    int sumEven = 0;
	    int i;
	    
	    //for loop
	    for(i=1 ; i<= 20 ; i++) //initialize , condition , update
	    {
	        if((i%2) == 0)  //body
	        {
	            sumEven = sumEven + i;
	        }
	        
	        else
	        {
	            sumOdd = sumOdd + i;
	        }
	    }
	    System.out.println("Using for loop");
	    System.out.println("Sum of Odd numbers : " + sumOdd + "\nSum of Even numbers : " + sumEven);
	   
	   
	   //while loop
	   sumOdd = 0;
	   sumEven = 0;
	   i=1; //initialize
	   
	   while(i<=20) //condition
	   {
	        if((i%2) == 0)  //body
	        {
	            sumEven = sumEven + i;
	        }
	        
	        else
	        {
	            sumOdd = sumOdd + i;
	        }
	        
	        i++;    //update
	   }
	    
	    System.out.println("\nUsing while loop");
	    System.out.println("Sum of Odd numbers : " + sumOdd + "\nSum of Even numbers : " + sumEven);
	    
	   
	   //do while loop
	   sumOdd = 0;
	   sumEven = 0;
	   i=1; //initialize
	   
	   do
	   {
	        if((i%2) == 0)  //body
	        {
	            sumEven = sumEven + i;
	        }
	        
	        else
	        {
	            sumOdd = sumOdd + i;
	        }
	        
	        i++;    //update
	        
	   }while(i<=20); //condition
	    
	    System.out.println("\nUsing do while loop");
	    System.out.println("Sum of Odd numbers : " + sumOdd + "\nSum of Even numbers : " + sumEven);
	     
	   
	}
}
