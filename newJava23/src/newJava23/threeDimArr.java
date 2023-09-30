package newJava23;

public class threeDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Three Dimensional Array
		int numbersE[][][] = {

				{ { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } },

				{ { 111, 222, 333 }, { 444, 555, 666 }, { 777, 888, 999 } },

				{ { 1111, 2222, 3333 }, { 4444, 5555, 6666 }, { 7777, 8888, 9999 } }

		};

		// Using for loop

		for (int i = 0; i < numbersE.length; i++) {
			int[][] arr = numbersE[i];

			for (int s = 0; s < arr.length; s++) {
				int[] arr1 = arr[s];

				for (int a = 0; a < arr1.length; a++) {
					System.out.println(arr1[a]);
				}
			}
		}

		// using while loop

		int i = 0;
		while (i < numbersE.length) {
			int[][] num = numbersE[i];

			int w = 0;
			while (w < num.length) {
				int[] num1 = num[w];

				int q = 0;
				while (q < num1.length) {
					System.out.println(num1[q]);
					q++;
				}
				w++;

			}
			i++;
		}
		
		
		
	// for Each loop
		
		for(int[][] num2:numbersE) {
			for(int[] num3:num2) {
				for(int num4:num3) {
					System.out.println(num4);
				}
			}
		}
	}

}
