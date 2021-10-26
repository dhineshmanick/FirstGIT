package org.print;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = i.nextInt();
		if (age <18) {
			System.out.println("You are not eligible");
			
		} else {
			System.out.println("You are eligible");

		}
	}
	
}


