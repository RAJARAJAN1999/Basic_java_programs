package com.Basicprogram;

import java.util.Scanner;

public class SwapingNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = input.nextInt();
		System.out.println("Enter the secound number : ");
		int y = input.nextInt();
		System.out.println("Before swaping :" + " " + x + " " + y);
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swaping :" + " " + x + " " + y);
		/*a=a+b;
		b=a-b;
		a=a-b;*/

	}

}
