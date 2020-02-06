package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*You can iterate through any collection object by using Iterator object.
It provides two methods to iterate. The hasNext() method returns true if the
iteration has more elements. The next() method returns the next element 
in the iteration. Below example shows how to iterate through an ArrayList.
Below example shows how to remove an element from collection object using Iterator object.
The remove() method removes from the underlying collection the last element returned by the iterator*/


public class CollectionIterator {

	 public static void main(String a[]){
	        
	        List<String> myList = new ArrayList<String>();
	        myList.add("Java");
	        myList.add("Unix");
	        myList.add("Oracle");
	        myList.add("C++");
	        myList.add("Perl");
	        
	        System.out.println("Before remove:");
	        System.out.println(myList);
	        
	        System.out.println("Print using iterator");
	        Iterator<String> itr = myList.iterator();
	        /*while(itr.hasNext()){
	            System.out.println(itr.next());
	        }*/
	        
	        String removeElem = "Unix";
	        while(itr.hasNext()){
	        	//System.out.println(itr.next());
	            if(removeElem.equals(itr.next())){
	                itr.remove();
	            }
	        }
	        System.out.println("After remove:");
	        System.out.println(myList);
	    }
	
}
