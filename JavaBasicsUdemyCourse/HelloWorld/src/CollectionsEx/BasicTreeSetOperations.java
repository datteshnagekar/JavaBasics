package CollectionsEx;


import java.util.TreeSet;

public class BasicTreeSetOperations {

	/**
	 * TreeSet is a NavigableSet implementation based on a TreeMap. The elements are ordered using 
	 * their natural ordering, or by a Comparator provided at set creation time, depending on which
	 * constructor is used. This implementation provides guaranteed log(n) time cost for the basic 
	 * operations (add, remove and contains).
	 * Below example shows basic operations on TreeSet like creating object, adding elements to it,
	 * verifies elements existance, deleting all elements at once, size of the set and deleting a 
	 * specific element.
	 */
	public static void main(String[] args) {
		 TreeSet<String> ts = new TreeSet<String>();
	        ts.add("one");
	        ts.add("two");
	        ts.add("three");
	        System.out.println("Elements: "+ts);
	        //check is set empty?
	        System.out.println("Is set empty: "+ts.isEmpty());
	        //delete all elements from set
	        ts.clear();
	        System.out.println("Is set empty: "+ts.isEmpty());
	        ts.add("one");
	        ts.add("two");
	        ts.add("three");
	        System.out.println("Size of the set: "+ts.size());
	        //remove one string
	        ts.remove("two");
	        System.out.println("Elements: "+ts);

	}
	
}
