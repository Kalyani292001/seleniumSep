package newJava23;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int x = 10;
		int y = 5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		int a = 8;
		int b = 4;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Calling the function 
		Calculator(12,4);
		
		AdditionA();
		AdditionA();
		AdditionA();
		AdditionA();
		AdditionA();
		AdditionA();
		
		
		AdditionB(23,5);
		AdditionB(21,5);
		AdditionB(21,5);
		AdditionB(26,5);
		AdditionB(28,9);
		
		int q1 = AdditionC(12,4);
		System.out.println(q1);
		System.out.println(q1+q1);
		System.out.println(q1 - 4);
		
		
	}
public static void  Calculator(int x , int y) {
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		
		
	}
	
	// function without parameter and without return type 
	
	public static void AdditionA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void AdditionB(int x , int y) {
		System.out.println(x+y);
	}
	
	// function with parameter and with return type 
	
	public static int AdditionC(int x , int y) {
		return x + y;
	}
}
