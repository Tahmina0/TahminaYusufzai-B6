package com.noorteck.java.hw16;

public class BrokenCode {

	

	public static void main(String[] args) {   // correct  the the spelling of "main" method 
			
			double addResult = addTwoNumbers(2.0, 4.0); //  method calling:  this line is calling the method from line 34 and line 34 is only consist of two parameters thus, we need to remove the extra one  
			
			System.out.println(addResult);
			
					 
			for( int  i = 0; i <= 10;  i++){  
				
				// there should be only one equal sign, instead  of the comma at the end of condition  we have to put semicolon 
				// in the condition part add the sign 
				// remove the semicolon from the end of closing parentheses 
				// only one closing parentheses 
				//remove the semicolon from the end of update
				
				
				System.out.println("Count="  +i); // remove the underscore and add (.) Additionally, the equal sign needs to be inside the double  quotation 
			
			// add + sign before the variable i 
			}
			
			
			
			
			String a= whoseFavNumber(23);  // the method whoseFavNumber is expecting a return  result and the type is String. Also, we  need one parameters because inside the method only one parameter is declared 
			 String b=whoseFavNumber(3);    // add a semicolon 		
			String c= whoseFavNumber(1);
		
			
			myName("John Cena"); // remove string greeting because we are not expecting a return result because we have declared void inside our method in this context 
	}    // add a closing parentheses because we are calling the method from the outside 
		public static void myName(String name) {
			System.out.println("My name is " + name);
		}



		public  static double  addTwoNumbers(double numOne,  double numTwo) { 
			// instead of semicolon add a comma in between  and remove the semicolon after the closing parentheses 
	          // remove method void because it is not returning a result 
			  // because we are expecting double result we have to add double and change the parameter to double  type as well 
			// remove the semicolon 
			double  result = numOne + numTwo;
			// change int to double 

			System.out.println(numOne + " + " + numTwo + " = " + result);
			
			return result;
		}

		
		public static String whoseFavNumber(int i){      // remove the assigned value and the assignment operator. Remove the extra parentheses at the end 
			
			// declare variable result 
			
			String result ="";
			
			if ( i == 1) {// remove the semicolon after 1 
				// add extra = sign because we are doing comparison 
				
				result = "Brook"; }// add double quotation marks and a semicolon at the end 
				// add a closing parentheses 
			else if (i == 2 || i ==4 ) { // add extra equal sign on both sides 
				// remove the extra i==4 because it is performing the same function 
				// 
				
				result = "Dannia";  // result should be written in lower case  and the String name Dannia should be in between double quotation and add semicolon 
			} else if (i== 3) {    // remove the semicolon and add an opening curly braces 
				                   // remove is and add == sign 
				                   // correct the else spelling 
			
				result = "Helen"; 
			}  else // remove the parentheses 
				result ="my favorite number"; //   the phrase has to be inside double quotation marks because its string 
			
		// add return result because we are expecting to return 
		return result; 
		
			
		
		}
	}




