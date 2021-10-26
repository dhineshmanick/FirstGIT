package org.print;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = i.nextInt();
		if (number %2 ==0) {
			System.out.println("Its a even number");
			
		} else {
			System.out.println("Its an odd number");

		}
			
		
		
	}

}
