package Oops;

public class acessModifire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PersonD d=new PersonD();
		d.display();

		PersonE e = new PersonE();
		e.display();

		PersonF f = new PersonF();
		//f.display();
		f.display2();

		PersonG g = new PersonG();
		g.display();
	}

}

class PersonD {

	void display() {
		System.out.println("Default ...");
	}

}

class PersonE {

	public void display() {
		System.out.println("Public ...");
	}

}

class PersonF {

	private void display() {
		System.out.println("Private ...");
	}

	public void display2() {
		System.out.println("public2");
		this.display();
	}

}


class PersonG {

	protected void display() {
		System.out.println("Protected ...");
	}

	public void display2() {
		System.out.println("Public2");
		this.display();
	}

}
