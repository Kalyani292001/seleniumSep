package newJava23;

public class ClassD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student amol  = new Student();
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		amol.display();
		
		
		Student amol2  = new Student();
		System.out.println(amol2.firstName);
		System.out.println(amol2.lastName);
		amol2.display();
		
		Student2 amol3 = new Student2("amol3","rao3");
		System.out.println(amol3.firstName);
		System.out.println(amol2.lastName);
		amol3.display();
		
		
		Student3 amol4 = new Student3();
		System.out.println(amol4.firstName);
		System.out.println(amol4.lastName);
		
		
		amol4.setFirstName("amol4");
		amol4.setlastName("rao4");
		amol4.display();
		
	}

}

class Student {
	
		String firstName = "chinmay";
		String lastName = "deshpande";
		
		public void display() {
			System.out.println(this.firstName + this.lastName);
		}
	
}

class  Student2 {
		String firstName;
		String lastName;
		
		public Student2(String firstName , String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public void display() {
			System.out.println(this.firstName + this.lastName);
		}
	

}

class Student3 {
	String firstName;
	String lastName;
	
	public void setFirstName(String fn) {
		this.firstName = fn;
	}
	
	public void setlastName(String ln) {
		this.lastName = ln;
	}
	
	void  display() {
		System.out.println(this.firstName + this.lastName);
	}
}