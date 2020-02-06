package CollectionsEx;


import java.util.Hashtable;

public class BasicHashTableOperations {

	/**
	 * 	Hashtable class implements a hashtable, which maps keys to values.
	 *  Any non-null object can be used as a key or as a value. To successfully store and
	 *  retrieve objects from a hashtable, the objects used as keys must implement the hashCode
	 *  method and the equals method.
	 *  Below example shows basic operations on Hashtable like creating hashtable object,
	 *  adding key-value pair, getting the value based on key, checking hashtable is empty or not,
	 *  removing an element, and size of the hashtable.
	 */
	public static void main(String[] args) {

        Hashtable<String,String> ht = new Hashtable<String,String>();
        //add key-value pair to hashtable
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third","THIRD INSERTED");
        System.out.println(ht);
        //getting value for the given key from hashtable
        System.out.println("Value of key 'second': "+ht.get("second"));
        System.out.println("Is Hashtable empty? "+ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());


	}

	
}
