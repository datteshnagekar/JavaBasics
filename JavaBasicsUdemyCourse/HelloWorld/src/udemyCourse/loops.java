package udemyCourse;


//method overriding overloading
//abstract interface
//try cath
//

public class loops {
	public static void main(String[] args) {
		
		whileLoop();
		System.out.println("\n");
		doWhileLoop();
		System.out.println("\n");
		forLoops();
	}
	
//	this my WHile Loop
	static void whileLoop()
	{
		int counter = 0;
		
		while(counter < 10)
		{
			counter = counter + 1;
			System.out.println("using while loops" +counter);
		}
	}
	
	
//	This is my DO While Loop
	
	static void doWhileLoop()
	{
		int counter = 0;
		
		do
		{
			counter = counter + 1;
			System.out.println("m in do while loop" +counter);
		}while(counter <10);
		
				
	}
	
	
	static void forLoops()
	{
		
//		for(initialize Counter; condition to see if we could run the loop; change counter variable)
		for(int counter = 0; counter < 10; counter++)
		{
			System.out.println("m in for statement" +counter);
		}
	}

}
