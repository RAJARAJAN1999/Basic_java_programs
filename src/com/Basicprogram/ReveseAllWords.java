package com.Basicprogram;

public class ReveseAllWords {

	public static void main(String[] args) {
		String s = "i am rajarajan from mannargudi i completed java course";
		String[] sp = s.split(" ");
		// System.out.println("spilt string array :"+sp);
		String Stringrev = "";
		for (String str : sp) {
			String rev_words = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev_words = rev_words + str.charAt(i);
			}
			Stringrev = Stringrev + rev_words + " ";
		}
		System.out.println(Stringrev);

	}

}
