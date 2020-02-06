package week1;

public class continueclass {
	
	public static void main(String[] args) {
		
		
		//using break
		for(int i = 0; i <= 10; i ++)
		{
			
			if(i < 5)
			{
				break; // ///break requires  condition to break like if statement
			}
			System.out.println("m printng break values" +i);
		}
		
		
		//using continue
		
		for(int i = 0; i <= 10; i ++)
		{
			
			if(i < 5)
			{
				continue;
			}
			System.out.println("m printing continue values" +i);
		}
		
		
	}

}

// break and continue is for while loops, for loops, do while loops
