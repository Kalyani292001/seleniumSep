package newJava23;

public class stringD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// program 1
		
		String text = "I am learning java";
	
		
		String textA = text.toUpperCase();
		System.out.println(textA);
		
		String textB = text.toLowerCase();
		System.out.println(textB);
		
		int a = text.length();
		System.out.println(a);
	
		
		// program 2
		
		String firstName = "amol";
		boolean q1 = firstName.equals("amol");
		System.out.println(q1);
		
		
		firstName = "amol";
		boolean q2 = firstName.equalsIgnoreCase("Amol");
		System.out.println(q2);
		
		String info = "I am new to java";
		boolean q3 = info.contains("I");
		System.out.println(q3);
		
		//   0   1   2   3
		//   a   m   o   l
		
		String firstNameD = "amol";
		char q4 = firstNameD.charAt(3);
		System.out.println(q4);
		
		// 0   1   2   3   4   5  6  7   8   9
		// c   h   a   n   d   r  a  p   u   r
		
		String info2 = "chandrapur";
		String q5 = info2.substring(4);
		System.out.println(q5);
		String q6 = info2.substring(4,8);
		System.out.println(q6);
	
		
		// Program 3
		
		String r1 = "I am learning javascript and javascript is great";
		
		String q7 = r1.replace("I", "W");
		String q8 = r1.replaceFirst("javascript", "python");
		String q9 = r1.replaceAll("javascript", "python");
		
		System.out.println(q7);
		System.out.println(q8);
		System.out.println(q9);
		
		String r2 = "kalyani"; 
		
		char [] r3 = r2.toCharArray();
		for(int i = 0 ; i < r3.length ; i++) {
			System.out.println(r3[i]);
		}
		
		// program 4
	
		String firstNameN = "kalyani";
		String lastNameN = "hadole";
		
		String q10 =  String.join(" ", lastNameN,firstNameN,"navnath");
		System.out.println(q10);
		String q11 =  String.join("@", lastNameN,firstNameN);
		System.out.println(q11);
		
		
		boolean q13 = "".isEmpty();
		System.out.println(q13);
		
		boolean q14 = firstNameN.startsWith("ka");
		System.out.println(q14);
		
		boolean q15 = firstNameN.endsWith("ni");
		System.out.println(q15);
		
	}

}
