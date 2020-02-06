package CollectionsEx;

import java.util.HashMap;

public class BasicHashMapOperations {

	
	/**
	 * HashMap is a Hash table based implementation of the Map interface. This implementation 
	 * provides all of the optional map operations, and permits null values and the null key. 
	 * The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized 
	 * and permits nulls. This class makes no guarantees as to the order of the map; in particular, 
	 * it does not guarantee that the order will remain constant over time. This implementation 
	 * provides constant-time performance for the basic operations (get and put), assuming the hash 
	 * function disperses the elements properly among the buckets. Iteration over collection views
	 * requires time proportional to the "capacity" of the HashMap instance (the number of buckets)
	 * plus its size (the number of key-value mappings). Thus, it's very important not to set the
	 * initial capacity too high (or the load factor too low) if iteration performance is important.
	 * Below example shows basic HashMap functionalities like creating object, adding entries,
	 * getting values by passing key, checking is hashmap is empty or not, deleting an element 
	 * and size of the HashMap.
	 */
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("101", "sabesh");
        hm.put("102", "Ratish");
        hm.put("103","Basit");
        hm.put("104","Siddhant");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of 2: "+hm.get("102"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
	}

	
}
