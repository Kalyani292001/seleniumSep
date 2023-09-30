package newJava23;

public class stringD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String
		
		String Name="Kalyani";
		
		System.out.println(Name);
		System.out.println(Name.charAt(0));
		System.out.println(Name.charAt(1));
		System.out.println(Name.charAt(2));
		System.out.println(Name.charAt(3));
		System.out.println(Name.charAt(4));
		System.out.println(Name.charAt(5));
		System.out.println(Name.charAt(6));
		
		// using loop
		
		for(int i=0;i<Name.length();i++) {
			System.out.println(i);
			System.out.println(Name.charAt(i));
		}
		
		// reverse
		
		for(int i=Name.length()-1; i>=0;i--) {
			System.out.println(i);
			System.out.println(Name.charAt(i));
		}
		
		

		int a = 2;
		int b = 3;
		String c = "Pune";
		System.out.println(a+b+c);  //5Pune
		System.out.println(b+c+a); //3Pune2
		System.out.println(c+a+b);  //Pune23
		
		
		String first_name = "Kalyani";
		String last_name = "Hadole";

		System.out.println("My firstname is "+first_name +" my lastName name is "+last_name);
		
		
		// upperCase()

		

		String firstName = "ShreyA";
		String UC = firstName.toUpperCase();
		System.out.println(UC);

        //LoerCase()
		String firstNameA = "SHREAYA";
		String LC = firstNameA.toLowerCase();
		System.out.println(LC);
		
		
		String info2 = "chandrapur";
		String q1 = info2.substring(4);
		System.out.println(q1);
		String q2 = info2.substring(4,8);
		System.out.println(q2);
		
		// contains()
		String info = "I am new to java";
		boolean q3 = info.contains("ne");
		System.out.println(q3);
		
        // equals()
		String firstNameB = "amruta";
		boolean q4 = firstNameB.equals("aMruta");
		boolean q5 = firstNameB.equals("amruta");
		System.out.println(q5);
		System.out.println(q4);
		
	}

}
