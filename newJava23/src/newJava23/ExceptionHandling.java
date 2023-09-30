package newJava23;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello");
//		System.out.println(10/0);
//		System.out.println("Bye");

		// program 2

		System.out.println("hello");

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("bye");

		// program 3
//
//		System.out.println("hello2");
//
//		try {
//
//			System.out.println(10 / 5);
//			int arr[] = { 11, 22, 33, 44 };
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(i);
//				System.out.println(arr[i]);
//			}
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Incorrect input");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//
//		}
//
//		System.out.println("bye");

		System.out.println("hello2");

		try {

			System.out.println(10 / 5);
			int arr[] = { 11, 22, 33, 44 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(i);
				System.out.println(arr[i]);
			}

		} catch (ArithmeticException e) {
			System.out.println("Incorrect input");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("I will execute any time any where");
		}

		System.out.println("bye");
	}

}
