package CollectionsEx;

import java.util.LinkedHashMap;


public class BasicLinkedHashMapOperations {

	/**
	 * LinkedHashMap is a combination of Hash table and linked list implementation of the Map interface,
	 * with predictable iteration order.It maintains a doubly-linked list running through all of its entries.
	 * The iteration order is normally the order in which keys were inserted into the map ie insertion order.
	 * The insertion order is not affected if a key is re-inserted into the map.
	 * Here you can find example code for basic LinkedHashMap operation. It shows how to
	 * create object for LinkedHashMap, adding elements, getting size, checking empty
	 * or not, remove, etc.
	 */
	public static void main(String[] args) {

		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("one", "This is first element");
		lhm.put("two", "This is second element");
		lhm.put("four", "this element inserted at 3rd position");
		System.out.println(lhm);
		System.out.println("Getting value for key 'one': " + lhm.get("one"));
		System.out.println("Size of the map: " + lhm.size());
		System.out.println("Is map empty? " + lhm.isEmpty());
		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
		System.out.println("Contains value 'This is first element'? "
				+ lhm.containsValue("This is first element"));
		System.out.println("delete element 'one': " + lhm.remove("one"));
		System.out.println(lhm);

	}

	
}
