package OopsRevision;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Son Amol=new Son("Navnath","Hadole","Amol");
		System.out.println(Amol.firstName);
		System.out.println(Amol.lastName);
		System.out.println(Amol.SName);
		
		Amol.DisplayName();
		Amol.displaySname();
	}

}

class father {
	String firstName;
	String lastName;

	public father(String fname, String lName) {
		this.firstName = fname;
		this.lastName = lName;
	}

	public void DisplayName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
}

class Son extends father {

	String SName;

	public Son(String fname, String lName, String sName) {
		super(fname, lName);
		this.SName = sName;
	}

	public void displaySname() {
		System.out.println(this.SName + " " + this.lastName);
	}
}
