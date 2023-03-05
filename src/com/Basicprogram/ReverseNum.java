package com.Basicprogram;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		// System.out.println("Enter the number ");
		int rev = 0, rem;
		int num1 = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println("reverse number is :" + rev);
		if (rev == num1) {
			System.out.println(" is a palindrome");
		} else {
			System.out.println(" is not a palindrome");
		}

	}

}
