package com.learning.java.day7.CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<String> l_list = new LinkedList<String>();
		
		
		list.add(120);
		list.add(10);
		list.add(890);
		list.add(120);
		list.add(120);
		list.add(120);
		list.add(120);
		list.add(120);
		list.add(120);
		
		System.out.println(list);
		
		System.out.println("size :" + list.size());
		
		System.out.println(list.get(1));
		
		System.out.println(list.remove(0));
		
		System.out.println(list);
		
		System.out.println(list.getClass());
		
		System.out.println(list.hashCode());
		
		
		System.out.println(list.isEmpty());
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> list2 =(ArrayList<Integer>) list.clone();
		System.out.println(list2);
		
		System.out.println(list.contains(120));
		
		System.out.println(list.toString());
		
		list.clear();
		
		System.out.println(list);
		
		
		l_list.addFirst("hello");
		l_list.addLast("worlds");
		l_list.getFirst();
		l_list.getLast();
		l_list.removeFirst();
		l_list.removeLast();
		
		
		
	}

}
