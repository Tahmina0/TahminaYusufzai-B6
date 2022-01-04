package com.noorteck.java.hw10;

public class Method2 {



	public static void main(String[] args) {
	    getGender('m');
	    getGender('M');
	    getGender('f');
	    getGender('F');
	    getGender('A');
	}
	
	public static void getGender(char gender)
	{
	    if( (gender == 'm') || (gender == 'M') )
	    {
	        System.out.println("Male");
	    }
	    else if( (gender == 'f') || (gender == 'F') )
	    {
	        System.out.println("Female");
	    }
	    else
	    {
	        System.out.println("Error. Invalid gender.");
	    }
	    
	    return;
	}
}