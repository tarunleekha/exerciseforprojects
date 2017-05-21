package com.my.sapient.reverselist;

import java.util.LinkedList;
import java.util.List;

public class ReverseMyLinkedList {
	
	public static void main(String[] args) {
		final List<String> list = new LinkedList<String>();
		list.add("tarun");
		list.add("jambesh");
		list.add("esh");
		list.add("sh");
		for(final String value : list){
			System.out.println(value);
		}
		int j=0;
		for(int i=list.size();i>0;i-- ){
			String previousValue = list.get(0);
			list.set(0, list.get(1));
			list.set(i-1,previousValue);
			
		}
		for(final String value : list){
			System.out.println(value);
		}
	}

}
