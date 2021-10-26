package org.print;

public class SumOdd {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i <=100; i++) {
			if (i % 2 != 0)
			{
				total = total+i;
			}
		}
		
		System.out.println("Total of odd numbers =" + total);
	}

}
