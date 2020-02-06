package udemyCourse;

public class ClassesAndObjects {
	
	
	public static void main(String[] args) {
		
		//creating objects of person class
		
//		Person obj1 = new Person(); //object one of class person wher person() --> is a constructor which collects info and sends to obj1
//*****************************************************************************************************************
		
		//		obj1 is 1st instance of an object and obj2 is the second instance of an object
		
		
//*******************************************************************************************************************
//		System.out.println("obj1 is the first instance of an object");
//		obj1.name = "Omkar";
//		obj1.surname = "Dias"; //here we r directly accessing varibales to an instance of an object
//		obj1.phoneno = 100;
//		obj1.age = 98;
//		obj1.rollno = 9211;
//		
//		System.out.println("my name is "+obj1.name + " "+obj1.surname + " and my phoneNo is " +obj1.phoneno + " my age is said to be " +obj1.age+ " and my rollNo is "+obj1.rollno);
//		System.out.println("\n");
		
		
		
/*		Person obj2 = new Person();
		obj2.name = "Agnelo";
		obj2.surname = "Gad";
		obj2.phoneno = 911;
		obj2.age = 89;
		obj2.rollno = 007;
		
		System.out.println("obj2 is the second instance of an object");
		System.out.println("my name is "+obj2.name + " "+obj2.surname + " and my phoneNo is " +obj2.phoneno + " my age is said to be " +obj2.age+ " and my rollNo is "+obj2.rollno);
		System.out.println("\n");
		
		*/
		
		
		
//		the above output shows that eventhough the objects are created from the same class the values are independent of each other
		
//		in other words in memory obj1.age and obj2.age are entirely different
		
//		whenever we create and object whatever is there inside the constructor will run
//		for constructor there is no returntype
		
		
		
//		STATIC: when a method or a variable is static it basically becomes the member of the class itself and not the instance of the class
		
		
		
//************************************************************************************************************************************************************
	
//		for passing values through constructor
		
		Person parmtrConstr = new Person("omkar", "Gad", 12);
		parmtrConstr.setAge(34);
		parmtrConstr.setPhoneno(911);
		
		
		
		
		System.out.println("my name is : " + parmtrConstr.getName() +" " + parmtrConstr.getSurname() + " \n");
		System.out.println(parmtrConstr.getRollno() + " : Roll No");
		System.out.println("my Age is : " + parmtrConstr.getAge());
		System.out.println("my PhoneNo is : " + parmtrConstr.getPhoneno());
		
		
		
		Person parmtrConstr2 = new Person("ViruGukha", "Gad", 12);
		parmtrConstr2.setAge(34);
		parmtrConstr2.setPhoneno(911);
		
		
		System.out.println("my name is : " + parmtrConstr2.getName() +" " + parmtrConstr2.getSurname() + " \n");
		System.out.println(parmtrConstr2.getRollno() + " : Roll No");
		System.out.println("my Age is : " + parmtrConstr2.getAge());
		System.out.println("my PhoneNo is : " + parmtrConstr2.getPhoneno());
		
		
//************************************************************************************************************************************************************
	
//*********************************creating a method which do not exist***************************************************************************************************************************

		
		parmtrConstr.sayhelloTo(parmtrConstr2);
		parmtrConstr2.sayhelloTo(parmtrConstr);
		
		
		
//************************************************************************************************************************************************************


		
	}
	
	
	

}
