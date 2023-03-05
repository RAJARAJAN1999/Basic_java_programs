package com.Basicprogram;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number factorials is : ");
		int num = input.nextInt();
		int fact = 1;
		for (int i = 0; i < num; num--) {
			fact = fact * num;
			System.out.print(num + " " + "*");
		}
		System.out.println("=" + fact);

	}

}
