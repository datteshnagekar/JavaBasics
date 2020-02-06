package udemyCourse;

public class VariableScope {
	
	
	//because x is declared outside of any method, it is in scope to all methods, in other words
	//any method can access x
	static int x;
	
	static int y;
	
	public static void main(String args[]) {
		 x = 10; // assigning value to x
		 System.out.println("value of x in main method is :" +x);
		 
		 dosomething();
		 dosomethingherealso();
	}
	
	static void dosomething() {
		 y = 12; //assigning value to y
		 System.out.println("value of x in method1 is : "  +y);
	}
	
	static void dosomethingherealso() {
//		because z is declared inside of this method, it is local to this method, in other words
//		no other method has access to z
		x = 8;
		y = 9;
		
		int z = 333; //declaring and initializing variable z
		
		System.out.println("printing value of x: " +x);
		System.out.println("printing value of y: " +y);
		System.out.println("printing value of y: " +z);
	}

}
