package com.Basicprogram;

public class Stringswap {

	public static void main(String[] args) {
		String name1 = "java";
		String name2 = "program";
		String name3 = name1 + name2;
		System.out.println("Before swaping :" + name1 + " " + name2);
		/*
		 * String temp = name1; name1=name2; name2=temp;
		 */
		// System.out.println("Before swaping :"+name1+" "+name2);
		//name2 = name3.substring(name1.length());//Error occured
		 name2=name3.substring(0, name3.length()-name2.length());
		name1 = name3.substring(name2.length());
		System.out.println("Before swaping :" + name1 + " " + name2);

	}

}
