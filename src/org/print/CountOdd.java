package org.print;

public class CountOdd {
	public static void main(String[] args) {	
		int odd = 0;
	    for(int i = 1; i <=100; i++) {
	        if(i % 2 !=0 )
			{         
	        	odd++;
	        }
						   	
	    }                 
		System.out.printf("\nNumber of odd elements in the array: %d",odd);

}}
