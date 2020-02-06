package week1;

public class OuterClassEx2 {
	
	private String x = "OOOOOOOOOOOOOOOOOUUUUUUUUUUUUUTTTTTTTTTTTTTTTTTTTTTTTTT";
	
	void doStuff() {
		
		String z = "Local variable ha hav ";
		
		
		class MyInnerClass{
			
			
			public void MyInnerMethod() {
				System.out.println("m inside dostuff() method --> MyInnerClass{} ---> and m printing MyinnerMethod() method Statements");
				System.out.println("OuterClassEx2 value of X = " +x);
				System.out.println("local variable inside dostuff method i.e value of Z = "+z);
			}
			
		}//close inner class defination
		MyInnerClass in = new MyInnerClass();
		in.MyInnerMethod();
	}//close outer class method doStuff()
	
	public static void main(String[] args) {
		OuterClassEx2 o = new OuterClassEx2();
		o.doStuff();
	}

}
