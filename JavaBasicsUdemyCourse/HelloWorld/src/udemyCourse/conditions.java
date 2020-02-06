package udemyCourse;

public class conditions {
	
	public static void main(String[] args) {
		
		
		
//		********************************************************************************
		//if (some expression evaluates to TRUE)
			//do something
		if(true) {
			System.out.println("if statemnt was true thats y i got printed");
		}
		System.out.println("hello mater");
		
		
		
//		***************************************************************************************************
		//in if statement the false condition is not executed directly it jumps to th end of if loop
		
		if(false) {
			System.out.println("i am false statement");
		}
		System.out.println("hello mater, if statement was false thats y u saw me getting printed");
		
		
//		***********************************************************************************************
//		using variables to set if statements to true and false
		// true and false variables are of type boolean
		
		
		boolean myNameIsTrue = true;
		boolean myNameIsFalse = false;
		
		if(myNameIsTrue)
		{
			System.out.println("m in true statement");
		}
		
		if(myNameIsFalse)
		{
			System.out.println("m in false statement");
		}
		
//		***********************************************************************************************
//		writing if and else statement under one if statement
		
		boolean mynameiskhan = true;
		
		if(mynameiskhan)
		{
			System.out.println("m in true statement in second if statement");
		}
		else
		{
			System.out.println("m in false statement in second if statement");
		}
		
//		***********************************************************************************************
		
//		<, , <=, >=, =, ==, ||, !=
//		if(x=5) assign 5 to x
//		if(x==5) test weather x has the value 5 (it will either be true or false)
		
//		&& AND, || OR
		
		if(true && true) {
			System.out.println("true");
		}
		if (true || false) {
			System.out.println("false");
		}
		
//		***********************************************************************************************
//		only the first statement to evaluate to tree gets executed
		boolean mytrue = true;
		boolean myfalse = false;
		
		if(mytrue)
		{
			System.out.println("m in true");
		}else if(myfalse){
			System.out.println("m in true again");
		}else {
			System.out.println("m in else now");
		}
		
	}

}
