package udemyCourse;

public class Methods {
	
	public static void main(String args[]) {
		
		printhellomethod();
		printhellomethod();
		
		System.out.println("\n");
		
		printSecHelloMethod();
		printSecHelloMethod();
		
		System.out.println("\n");
		
		printName("yogesh");
		printSecName("omkar");
		
		
		System.out.println("\n");
		//taking an integer input from a method and printing it
		int x;
		x = returnnum();
		System.out.println("value of x in method returnnum is: " +x);
		
		
		
		//f = x * x
		
		
		//type I
		int result = squareNum(5);
		System.out.println("square of two numbers is " +result);
		
		
		//Type II
		int result2 = squareNum(returnnum());
		System.out.println("square of two numbers is " +result2);
		
		//Type III
		
		System.out.println("square of two numbers is " +squareNum(returnnum()));	
		
		
	}
	
	
	
	//this method takes in value and prints that data
	static int squareNum(int x) {
		
		return x * x;
		
		
	}
	
	
	//this method returns an int type with value 4
	static int returnnum() {
		return 4;
		
	}
		
	
	//returns a value name which is in string when passed via method printName
	static void printName(String name) {
		System.out.println("my name is " +name);
	}
	
	
	static void printSecName(String name2) {
		System.out.println( "my name from method 2 is " +name2);
	}
	
	
	// prints method whatever is there in the i.e printhellomethod print statement
	static void printhellomethod() {
		System.out.println("i am in  hello method");
	}
	
	static void printSecHelloMethod() {
		System.out.println("i am in second hello method");
	}

}
