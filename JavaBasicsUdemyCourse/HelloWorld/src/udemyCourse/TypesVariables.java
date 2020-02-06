package udemyCourse;

public class TypesVariables {

	public static void main(String[] args) {
		int myvar1;
		myvar1 = 3;
		
		int myvar2 = 10;
		
		System.out.println(myvar1);
		System.out.println(myvar2);
		
		myvar2 = myvar2 + myvar1;
		
		System.out.println(myvar2);
		
		myvar1 = myvar1 + myvar1;
		
		System.out.println(myvar1);
		
		
		double x = 3.55;
		
//		myvar1 = x; // cannot convert a number which is in double i.e with .5 precision to integer
		
		x = myvar1;
		
		
		System.out.println(x);
		
	}
}
