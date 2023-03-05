package com.Basicprogram;

public class Divisiblenum {

	public static void main(String[] args) {
		// check if a number is divisible by 2,3,5...
		int n = 100;
		int div2 = 0, div3 = 0, div5 = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				div2++;
			}
			if (i % 3 == 0) {
				div3++;
			}
			if (i % 5 == 0) {
				div5++;
			}

		}
		System.out.println("Divisible by 2 from 1 to " + n + " " + "=" + div2);
		System.out.println("Divisible by 3 from 1 to " + n + " " + "=" + div3);
		System.out.println("Divisible by 5 from 1 to " + n + " " + "=" + div5);

	}
}
