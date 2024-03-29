package collections;

public class LoopingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[2];
		a[0] = 1;
		a[1] = 2;
		System.out.println(a); // address

		String first_name = "Kalyani";
		// loop on string

		for (int i = 0; i < first_name.length(); i++) {
			System.out.println(first_name.charAt(i));// every element
		}

		Person kalyani = new Person("kalyani", "hadole");
		Person shivaji = new Person("shivaji", "pawar");
		Person shreya = new Person("shreya", "shinde");
		Person samuruddhi = new Person("samruddhi", "kumawat");

//		System.out.println(kalyani);
//		kalyani.displayName();

		// int
		// program 1
		int[] aa = new int[3];
		aa[0] = 11;
		aa[1] = 12;
		aa[2] = 13;
		// program 2
		int[] aaa = { 11, 22, 33, 44 };

		// String
		// program 1
		String[] names = { "Kalyani", "amol", "nilesh" };
		// program 2
		String[] namesA = new String[2];
		namesA[0] = "Kalyani";
		namesA[1] = "santosh";

		// Person
		// program 1
		Person[] bb = new Person[2];
		// program 2
		Person[] bbb = { kalyani, samuruddhi, shivaji, shreya };

		// for loop
		for (int i = 0; i < bbb.length; i++) {
			System.out.println(bbb[i].first_name);
			System.out.println(bbb[i].last_name);
			bbb[i].displayName();
		}

		// for Each loop
		for (Person s : bbb) {
			System.out.println(s.first_name);
			System.out.println(s.last_name);
			s.displayName();
		}

		int n = 7;
		int fact = fact(n);
		System.out.println("factorial of " + n + " is" + "=" + fact);

	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fact(n - 1);
	}

}

class Person {

	String first_name;
	String last_name;

	public Person(String fn, String ln) {
		this.first_name = fn;
		this.last_name = ln;
	}

	public void displayName() {
		System.out.println(this.first_name + this.last_name);
	}
}
