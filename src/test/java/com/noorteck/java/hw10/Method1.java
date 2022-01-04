package com.noorteck.java.hw10;

public class Method1 {
	

	public static void main(String[] args) {
	calculate(2.0 , 4.0 , '+');	
	calculate(2.0 , 4.0 , '-');	
	calculate(2.0 , 4.0 , '/');	
	calculate(2.0 , 4.0 , '*');
	calculate(2.0 , 4.0 , '%');	
	calculate(2.0 , 4.0 , 'a');
	}
	
	public static void calculate(double numOne, double numTwo, char mathOperationSign)
    {
        double result;
        if(mathOperationSign == '+')
        {
            result = numOne + numTwo;
            System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
        }
        else if(mathOperationSign == '-')
        {
            result = numOne - numTwo;
            System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
        }
        else if(mathOperationSign == '/')
        {
            result = numOne / numTwo;
            System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
        }
        else if(mathOperationSign == '*')
        {
            result = numOne * numTwo;
            System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
        }
        else if(mathOperationSign == '%')
        {
            result = numOne % numTwo;
            System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
        }
        else
        {
            System.out.println("Error. Incorrect math operation sign.");
        }
        
        return;
    }
    
}
