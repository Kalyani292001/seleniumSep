package newJava23;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comparison

				// < , > , <= , >= , != , ==

				boolean a = 8 < 9;
				System.out.println(a);

				System.out.println(8 > 9); // false
				System.out.println(8 == 8); // true
				System.out.println(8 != 9); // true
				System.out.println(8 <= 9); // true
				System.out.println(8 >= 9); // false
				System.out.println(8 < 9); // true
				System.out.println(8 > 9); // false

				// program 2

				// && AND

				// true && true =====> true
				// false && true =====> false
				// true && false =====> false
				// false && false ====> false

				System.out.println(8 != 7 && 9 == 9);
				System.out.println(8 == 7 && 9 == 9);
				System.out.println(8 != 7 && 9 != 9);
				System.out.println(8 == 7 && 9 != 9);

				// || OR

				// true || true =====> true
				// false || true =====> true
				// true || false =====> true
				// false || false =====> false

				System.out.println(8 != 7 || 9 == 9); // true
				System.out.println(8 == 7 || 9 == 9); // true
				System.out.println(8 != 7 || 9 != 9); // true
				System.out.println(8 == 7 || 9 != 9); // false

				// not !

				System.out.println(!(9 == 9));
				System.out.println(!(9 != 9));
				
				// program 3

				// conditional statements

				int numT = -12;

//				if(numT > 0 && numT <= 5) {
//					System.out.println("10 % discount");
//				}
//				if(numT > 5 && numT <= 10) {
//					System.out.println("20 % discount");
//				}
//				
//				if(numT > 10) {
//					System.out.println("30 % discount");
//				}

				if (numT > 0 && numT <= 5) {
					System.out.println("10 % discount");
				} else if (numT > 5 && numT <= 10) {
					System.out.println("20 % discount");
				}
				else if (numT > 10) {
					System.out.println("30 % discount");
				} else {
					System.out.println("incorrect input ");
				}
				
				// program 4 
				
				int marks = 55;
				
//				if(marks > 90) {
//					System.out.println("Grade A");
//				}
//				if(marks > 75) {
//					System.out.println("Grade B");
//				}	
//				if(marks > 65) {
//					System.out.println("Grade C");
//				}	
//				if(marks > 90) {
//					System.out.println("Grade A");
//				}
//				else if(marks > 75) {
//					System.out.println("Grade B");
//				}
//					
//				else if(marks > 65) {
//					System.out.println("Grade C");
//				}
//				else {
//					System.out.println("Fail try again");
//				}	
//				
//				
				
				
				
				// program 4
				
				int x = 20;
				int y = 5 ; 
				
				
				if(x > y) {
					System.out.println("x is greater");
				}
				else {
					System.out.println("y is greater");
				}
						
				String grt = x > y ? "x is greater":"y is greater";
				System.out.println(grt);
				
		       // program 5
				
				int x1 = 80;
				int x2 = 500;
				int x3 = 4330;
			
				if(x1 > x2 && x1 > x3) {
					System.out.println("x1 is greater");
				}
				else if(x2 > x1 && x2 > x3) {
					System.out.println("x2 is greater");
				}
				else {
					System.out.println("x3 is greater");
				}

				// if statement(every condition check)
				int y3=10;
				int y1=20;
				int y2=30;
				
				if(y1>y2 && y1>y3) {
					System.out.println("y1 is Greater");
				}
				if(y2>y1 && y2>y3) {
					System.out.println("y2 is Greater");	
				}
				if(y3>y1 && y3>y2) {
					System.out.println("y3 Is Greater");	
				}
				
				// if else statement (first condition check its false then second condition check)
				int a3=10;
				int a1=20;
				int a2=30;
				
				if(a1>a2 && a1>a3) {
					System.out.println("a1 is Greater");
				}
				else if(a2>a1 && a2>a3) {
					System.out.println("a2 is Greater");	
				}
				else if(a3>a1 && a3>a2) {
					System.out.println("a3 Is Greater");	
				}
				else {
					System.out.println("Wrong Inpute");
				}
				
				
				//tenary operator 
				
				
				int a4 = 10;
				int b = 5;
				
				
				String grt1  = a4 > b ? "a4 is greater":"b is greater";
				System.out.println(grt1);
				
				int age = 18;
				
				String jkl = age >= 18 ? "canndrive":"cannotdrive";
				System.out.println(jkl);
				
				
				// switch case 
				
				String city = "jaipur";
//				switch(city) {
//				case "pune":
//					System.out.println("MH");
//				case "jaipur":
//					System.out.println("RJ");
//				case "varanasi":
//					System.out.println("UP");
//				default:
//					System.out.println("Incorrect city name");
//				
//				}
				
//				switch(city) {
//				case "pune":
//					System.out.println("MH");
//					break;
//				case "jaipur":
//					System.out.println("RJ");
//					break;
//				case "varanasi":
//					System.out.println("UP");
//					break;
//				default:
//					System.out.println("Incorrect city name");
//				
//				}
				
			
				switch(city) {
				case "pune":
				case "nagpur":
					System.out.println("MH");
					break;
				case "jaipur":
				case "udaipur":
					System.out.println("RJ");
					break;
				case "varanasi":
				case "lucknow":
					System.out.println("UP");
					break;
				default:
					System.out.println("Incorrect city name");
				
				}
				
				//==================================
				
				switch (city) {
				case "pune":
					System.out.println("MH");
					break;
				case "varanasi":
					System.out.println("UP");
					break;
				case "Jaipur":
					System.out.println("RJ");
					break;
				default:
					System.out.println("incorrect city name");
					
				}
	}

}
