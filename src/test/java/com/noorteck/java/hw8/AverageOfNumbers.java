package com.noorteck.java.hw8;

public class AverageOfNumbers {

	public static void main (String []args) {
	
		 
		    int sum = 0;
		    int i;{
		    
		    //for loop
		    for(i=21 ; i<=29 ; i++) //initialization, condition , update statements
		    {
		        sum = sum + i ; //body
		    }
		    
		    double avg = sum / 9.0 ;
		    System.out.println("Average found using for loop: " + avg);
		    
		    
		    
		    //while loop
		    sum=0;
		    avg=0;
		    i = 21; //initialize
		    
		    while(i<=29)    //condition statement
		    {
		        sum = sum + i ; //body
		        
		        i++;    //update statement
		    }
		    
		    avg = sum / 9.0 ;
		    System.out.println("Average found using while loop: " + avg);
		    
		    //do while loop
		    sum=0;
		    avg=0;
		    i = 21; //initialize
		    
		    do
		    {
		        sum = sum + i ; //body
		        
		        i++;    //update statement
		        
		    }while(i<=29);  //condition statement
		    
		    avg = sum / 9.0 ;
		    System.out.println("Average found using do while loop: " + avg);
		    
		}
	
}
}

