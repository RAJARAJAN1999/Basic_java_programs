package com.Basicprogram;

import java.util.Scanner;

public class Greatestof3Num {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = input.nextInt();
		System.out.println("Enter the secound number : ");
		int b = input.nextInt();
		System.out.println("Enter the thired number : ");
		int c = input.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " " + "is a Greatest number ");
		} else if (b > a && b > c) {
			System.out.println(b + " " + "is a Greatest number ");
		} else if (c > a && c > b) {
			System.out.println(c + " " + "is a Greatest number ");
		} else {
			System.out.println("All number is same ");
		}
	}

}
