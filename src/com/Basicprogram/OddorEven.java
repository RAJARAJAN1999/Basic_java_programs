package com.Basicprogram;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// find a number is add or even
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = in.nextInt();
		if (num % 2 == 0) {// using if...else
			System.out.println(num + " " + "is a Even numbers");
		} else {
			System.out.println(num + " " + "is a Odd numbers");
		}

		String evenodd = num % 2 == 0 ? "Even" : "odd";// using ternary Operator
		System.out.println(num + " is" + evenodd);
	}
}
