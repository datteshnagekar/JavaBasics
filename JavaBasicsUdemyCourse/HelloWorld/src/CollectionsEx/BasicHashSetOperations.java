package CollectionsEx;

import java.util.HashSet;

public class BasicHashSetOperations {

	
	/**
	 * The HashSet class implements the Set interface, backed by a hash table 
	 * (actually a HashMap instance). It makes no guarantees as to the iteration order of the set;
	 * in particular, it does not guarantee that the order will remain constant over time. 
	 * This class permits the null element. This class offers constant time performance for the 
	 * basic operations (add, remove, contains and size), assuming the hash function disperses
	 * the elements properly among the buckets. Iterating over this set requires time proportional
	 * to the sum of the HashSet instance's size (the number of elements) plus the "capacity" of 
	 * the backing HashMap instance (the number of buckets). Thus, it's very important not to set
	 * the initial capacity too high (or the load factor too low) if iteration performance is important.
	 * Below example shows basic operations on HashSet object like creating object, 
	 * adding elements, verifying whether the hashset is empty or not, removing an element,
	 *  size of the hashset, and to check whether an object exists or not.
	 */
	public static void main(String[] args) {
		
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));

	}
	
}
