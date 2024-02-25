package collections;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		int fact = fact(n);
		System.out.println("factorial of " + n + " is :" + fact);

	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
