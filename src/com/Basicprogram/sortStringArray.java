package com.Basicprogram;

import java.util.Arrays;
import java.util.Collections;

public class sortStringArray {

	public static void main(String[] args) {
		String[] a = { "java", "programming", "testing", "Spring boot" };
		Arrays.sort(a);
		System.out.println("Assending order :");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Dessending order :");
		System.out.println(Arrays.toString(a));

	}

}
