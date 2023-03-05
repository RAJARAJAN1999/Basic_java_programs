package com.Basicprogram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String[] str= {"raja","rajan","prathap","raja","kavii","prathap"};
		Set<String>set=new HashSet<String>();
		for(String i:str) {
			if(!set.add(i)) {
				System.out.println("Find duplicate elements :"+i);
			}
		}
		System.out.println("Remove duplicate elements :"+set);

	}

}
