package Oops;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program 1
		Father Navnath = new Father();
		System.out.println(Navnath.fname);
		System.out.println(Navnath.lName);
		Navnath.displayfname();
       //Navnath.displayfname();

       // Program 2
		Son Amol = new Son();
		System.out.println(Amol.fName);
		System.out.println(Amol.lName);
		System.out.println(Amol.sName);

		Amol.displayName();
		Amol.displaySname();

		SonA Nilesh = new SonA("Navnath", "Hadole", "Nilesh");

		System.out.println(Nilesh.fName);
		System.out.println(Nilesh.lName);
		System.out.println(Nilesh.sName);

		Nilesh.displayName();
		Nilesh.displaySname();

	}

}

class FatherC {
	String fName;
	String lName;

	public FatherC(String fn, String ln) {
		this.fName = fn;
		this.lName = ln;
	}

	public void displayName() {
		System.out.println(this.fName + this.lName);

	}
}

class SonA extends FatherC {
	String sName;

	public SonA(String fn, String ln, String sn) {
		super(fn, ln);
		this.sName = sn;
	}

	public void displaySname() {
		System.out.println(this.sName + this.lName);
	}
}

class FatherB {
	String fName = "Navnath";
	String lName = "Hadole";

	public void displayName() {
		System.out.println(this.fName + this.lName);
	}
}

class Son extends FatherB {
	String sName = "Amol";

	public void displaySname() {
		System.out.println(this.sName + this.lName);
	}
}

class Father {
	String fname = "Navnath";
	String lName = "Hadole";
	private int age = 22;

	private void displayname(String fn, String ln) {
		this.fname = fn;
		this.lName = ln;

	}

	public void displayfname() {
		System.out.println(this.age);
		this.displayname("Navnath", "Hadole");
	}
}
