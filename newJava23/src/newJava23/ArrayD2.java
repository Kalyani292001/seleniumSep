package newJava23;

public class ArrayD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array[]
		// program 1
		int numbers[] = new int[2];
		numbers[0] = 1;
		numbers[1] = 2;

		int numbers2[] = { 11, 22, 33, 44, 55, 66 };
		int[] numbers3 = { 77, 88, 99, 100, 110 };

		// program 2
		// Array stores the value by index
		// collection of similar data types

		// access the value
		System.out.println(numbers[0]);

		// updating the value;
		numbers[0] = 222;
		System.out.println(numbers[0]);

		// program 3
		// To find the length of array
		String[] names = { "kalyani", "aryan", "amol", "dhanvi" };
		int q1 = names.length;
		System.out.println(q1);

		// for loop

		for (int i = 0; i < names.length; i++) {
			System.out.println(i);
			System.out.println(names[i]);
		}

		// while loop

		int j = 0;
		while (j < names.length) {
			System.out.println(names[j]);
			j++;
		}

		// forEach loop

		for (String n : names) {
			System.out.println(n);
		}

		// Multi dimensional array

		String[][] states = { { "pune", "nagpur", "wardha" }, { "indore", "bhopal", "ujjain" },
				{ "jaipur", "udaipur", "jaisalmer" } };

		// for loop

		for (int i = 0; i < states.length; i++) {
			String[] citi = states[i];
			for (int k = 0; k < citi.length; k++) {
				System.out.println(citi[k]);
			}
		}

		// while loop

		int k = 0;
		while (k < states.length) {
			String[] city = states[k];
			int s = 0;
			while (s < city.length) {
				System.out.println(city[s]);
				s++;
			}
			k++;
		}

		// forEach loop

		for (String[] a : states) {
			for (String h : a) {
				System.out.println(h);
			}
		}

		

		
	
	}

}
