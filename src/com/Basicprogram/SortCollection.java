package com.Basicprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		String[]a= {"java","programming","testing","Spring boot"};
		List<String>list=new ArrayList<String>();
		for(String s:a) {
			list.add(s);
		}
		Collections.sort(list);
	System.out.println(list);
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);

	}

}
