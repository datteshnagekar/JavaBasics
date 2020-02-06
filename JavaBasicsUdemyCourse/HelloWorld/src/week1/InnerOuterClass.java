package week1;


public class InnerOuterClass {
	
	private int x = 8;
	
	
		
		void outer() {
			System.out.println("m within outer class in outer method");
			
			Inner in = new Inner();
			in.inner();
		
	} 
	
	class Inner{
		void inner() {
			System.out.println("m within Inner Class in inner method\n");
			
			System.out.println("outer value x = " +x);
		}
	
	}
	
	public static void main(String[] args) {
		
		//InnerOuterClass.Inner var = new InnerOuterClass().new Inner();
		
		//var.inner();
		
		InnerOuterClass ou = new InnerOuterClass();
		
		ou.outer();
		
		
	}

}
