package com.learning.java.day7.CollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
	
		
		HashSet<String>  set = new HashSet<String>();
		
		set.add("hello");
		set.add("World");
		set.add("Binary");
		set.add("logic");
		
		set.add("hello");
		
		System.out.println(set);
		
		HashSet<Integer>  intset = new HashSet<Integer>();
	
		intset.add(3);
		intset.add(3);
		intset.add(3);	
		
		intset.add(2);
		intset.add(3);
		intset.add(3);
		intset.add(3);
		
		
		System.out.println(intset);
		
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(9);
		treeSet.add(21);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(1);
		
		System.out.println(treeSet);
	}

}
