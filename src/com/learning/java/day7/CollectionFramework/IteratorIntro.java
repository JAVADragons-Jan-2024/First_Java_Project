package com.learning.java.day7.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIntro {
	
	
//Iterator	
	
	// it is used to read the data from all types of Collection implementation classes 
	// heere we can read and remove the data as well using Iterator
	// it has some predefined methods
    //  hasNext();
    //  next();
	//  remove();
	
//	cons
	
//	1. We can only read  in forward direction
//	2. we can do only read and remove
//	3. we can not perform add and update
	
	
//	ListIterator
	
	// - we can all kinds of operations 
	// - we can read in both directions
	// it has some predefined methods
	 //  hasNext();
    //  next();
	//  remove();
     //	hasPrevious();
     //	previous();
     //	nextIndex();
     //	previoudIndex();
     //	 add();
	//  set();
		
	
// Cons:
	 
	//  We can use this only for List implemented Classes
	
	
//	ex:   
	
   public static void main(String[] args) {
	
	   
		ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i <= 10; i++) {
				list.add(i);
			}
			
			System.out.println(list);
			
			Iterator<Integer> itr = list.iterator();
			
			while(itr.hasNext()) {
				
				
				 int i=itr.next();

				
				if(i % 2 == 0 ) {
					 System.out.println(i);
				}else {
					itr.remove();
				}
				
			}
			
			System.out.println(list);
			
}
	

}
