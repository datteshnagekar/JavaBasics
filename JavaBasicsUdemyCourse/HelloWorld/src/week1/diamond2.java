package week1;

public class diamond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("to print  second half pattern of Diamond");
		
		int n = 5;
		patterndraw(n);

	}
	private static void patterndraw(int n) {
		// TODO Auto-generated method stub
		
		int i, j;
		
//		for first right half of the diamond
		for(i=5; i<=n; i--) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
            
//            while (i == 0) {
//            	System.out.println("diamond printing finished");
//            	System.exit(0);
//            }
        } 
		
//		first half of the diamond completed
		
		
		
		
	}

}
