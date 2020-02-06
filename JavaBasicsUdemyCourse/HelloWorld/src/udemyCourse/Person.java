package udemyCourse;

public class Person {
	
	String name; //intance variable
	int age;
	String surname;
	int rollno;
	int phoneno;
	
//	*************************constructor************************************************************************************
	public Person(String myname, String mysurname, int myroll) {
		this.name = myname;
		this.surname = mysurname;
		this.rollno = myroll;
		
		System.out.println("m in default constructor and i will run the number of time m called i.e object of this class is called");
		
		
	}

	
	
	
//	********************constructor end*********************************************************************************

	
//**********************Getters & setters**************************************************************************************************************************************
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}




	//public void sayhelloTo(String namkaran) {
		// TODO Auto-generated method stub
//		System.out.println(getName() + "said hello to " +namkaran.getChars());
	//}



// 								  ^^^^^^
	public void sayhelloTo(Person Person) { /// instead of the second person if we put parmtrconstr2 we cant access the second one from 
		// TODO Auto-generated method stub
		
		System.out.println(getName() + " said hello to " + Person.getName() );
		
	}




	
	
//***********************getters and setters*************************************************************************************************************************************
	
}
