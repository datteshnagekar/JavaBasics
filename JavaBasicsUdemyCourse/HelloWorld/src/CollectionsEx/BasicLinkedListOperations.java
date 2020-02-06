package CollectionsEx;


import java.util.LinkedList;


public class BasicLinkedListOperations {

	/**
	 * LinkedList is a linked list implementation of the List interface. Implements all 
	 * optional list operations, and permits all elements (including null). In addition 
	 * to implementing the List interface, the LinkedList class provides uniformly named 
	 * methods to get, remove and insert an element at the beginning and end of the list.
	 * These operations allow linked lists to be used as a stack, queue, or double-ended queue.
	 * Here we can see example for basic operations like creating object for LinkedList,
	 * adding objects into LinkedList, searching an object in LinkedList, whether it is 
	 * listed under this LinkedList instance or not, checking whether the LinkedList is 
	 * empty or not, and finally size of the LinkedList.
	 */
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));

	}
	
}
