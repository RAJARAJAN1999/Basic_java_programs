package com.Basicprogram;

public class FindDup {

	public static void main(String[] args) {
		String[] str= {"raja","rajan","prathap","raja","kavii","prathap","rajan"};
		for(int i=0;i<str.length-1;i++) {//0,1,2,3,4,5,6
			for(int j=i+1;j<str.length;j++) {//1,2,3,4,5,6
				if(str[i]==str[j]) {
					System.out.println("Find duplication elements :"+str[i]);
				}
			}
		}

	}

}
