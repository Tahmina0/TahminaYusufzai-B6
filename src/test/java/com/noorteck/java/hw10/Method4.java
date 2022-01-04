package com.noorteck.java.hw10;

public class Method4 {
	public static void main (String []args) {
		getDoWhileLoopResult(2,8);
		
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		int i=minNum; 
		
		
		do
		{
		System.out.println(i);
		i++;
		}while(i<=maxNum);
		return;
	} 
	
}
