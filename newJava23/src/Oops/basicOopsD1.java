package Oops;

public class basicOopsD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 1
		Person Kalyani=new Person();
		System.out.println(Kalyani.firstName);
		System.out.println(Kalyani.lastName);
		System.out.println(Kalyani.age);
		
		Kalyani.displayName();
		
		// Program 2
		
		PersonA Shweta=new PersonA("Shweta","Gorse",23,21);
		System.out.println(Shweta.firstName);
		System.out.println(Shweta.lastName);
		System.out.println(Shweta.age);
		System.out.println(Shweta.rollNo);
		
		Shweta.displayName();
	}

}


// Program 1

class Person{
	String firstName="Kalyani";
	String lastName="Hadole";
	int age=23;
	
	public void displayName(){
		System.out.println(this.firstName+this.lastName);
	}
}


// Program 2

class PersonA{
	
	String firstName;
	String lastName;
	int age;
	int rollNo;
	
	public PersonA(String fn,String ln,int ag,int rn) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=ag;
		this.rollNo=rn;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName+ " " + this.lastName);
	}
}