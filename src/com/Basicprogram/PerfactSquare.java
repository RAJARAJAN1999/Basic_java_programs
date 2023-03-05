package com.Basicprogram;

import java.util.Scanner;

public class PerfactSquare {

	public static void main(String[] args) {
		// perpect square 1*1=1 /2*2=4 /3*3=9 /4*4=16 /5*5=25/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the square number is :");
		int num = sc.nextInt();

		boolean square = false;
		for (int i = 1; i <= num; i++) {
			if (num == i * i) {
				square = true;
				break;
			}
		}
		if (square == true) {
			System.out.println("is perfect square");
		} else {
			System.out.println("is not perfect square");
		}
	}

}
