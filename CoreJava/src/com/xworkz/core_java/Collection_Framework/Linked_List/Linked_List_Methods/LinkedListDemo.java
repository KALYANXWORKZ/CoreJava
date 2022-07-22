package com.xworkz.core_java.Collection_Framework.Linked_List.Linked_List_Methods;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Jerry");
		ll.add("Dev");
		ll.add("Always Leave in Darkness");
		
		System.out.println(ll);
		
	    ll.addFirst("Devil");
	    System.out.println(ll);
	    
	    ll.addLast("Hello");
	    System.out.println(ll);

	    System.out.println(ll.get(0));
	    System.out.println(ll.getFirst());
	    System.out.println(ll.getLast());
	    System.out.println(ll.remove(2));
	    System.out.println(ll.removeLast());
	    System.out.println(ll.removeFirst());
	    
	}
}
