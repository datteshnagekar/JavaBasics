package CollectionsEx;
import java.util.TreeMap;

public class BasicTreeMapOperations {

	/**
	 * TreeMap is a Red-Black tree based NavigableMap implementation. The map is sorted 
	 * according to the natural ordering of its keys, or by a Comparator provided at map 
	 * creation time, depending on which constructor is used. This implementation provides 
	 * guaranteed log(n) time cost for the containsKey, get, put and remove operations.
	 * Below example shows basic operations on TreeMap like creating an object, adding 
	 * key-value pair objects, getting value by passing key object, checking whether the map 
	 * has elements or not, deleting specific entry, and size of the TreeMap.
	 */
	public static void main(String[] args) {
		
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());

	}
	
}
