package udemyCourse;

public class ReferenceAndValueType {
	
//	byte, short, int, long, float, double, boolean, char 
//	whenver we r using the above type it is of value type and whenever we using jlabel,javfx etx we r using reference type
	
	public static void main(String[] args) {
		int x = 5;
//		adding commit for 1st commit
		addOneTo(x);
		System.out.println(x);
		
	}
	
	
	static void addOneTo(int number) {
		number = number + 1;
		
		//System.out.println("m in add one to method and m printing" +number);
	}
	
}
