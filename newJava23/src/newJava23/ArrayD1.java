package newJava23;

public class ArrayD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1
				String firstName = null;
				System.out.println(firstName);

				int a = 0;
				System.out.println(a);

				int [] numbers = new int[3];
				int numbers2 [] = new int[4];

				System.out.println(numbers[0]);
				numbers[0] = 11;
				numbers[1] = 12;
				numbers[2] = 13;
				//numbers[3] = 14;
				System.out.println(numbers);

				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);


				// program 2

				int [] numbersC  =  new int[3];
				int numbersD  []  = new int[3];
				//                     0  1  2  3  4  5  6
				int numbersE  []   = {11,22,33,55,66,77,88};

				for(int i = 0 ; i < numbersE.length ; i++) {
					//System.out.println(i);
					System.out.println(numbersE[i]);
				}

				// program 3

				int numbersF  []   = {11,22,33,55,66,77,88};

				int t1 = 0;

				while(t1 < numbersF.length) {
					//System.out.println(t1);
					System.out.println(numbersF[t1]);
					t1 ++;
				}

				// program 4

				int numbersG  []   = {11,22,33,55,66,77,88};
				for(int x:numbersG) {
					System.out.println(x);
				}

				// program 5

				String [] names = new String[3];
				String [] cities = {"pune","nagpur","mumbai","banglore"};


				for(int i = 0 ; i < cities.length ; i++) {
					System.out.println(cities[i]);
				}

				int t2 = 0;


				while(t2 < cities.length) {
					System.out.println(cities[t2]);
					t2 ++;
				}

				for(String i : cities) {
					System.out.println(i);
				}

				// program 6


				int [][] numbersB = new int [3][3];
				int [][] numbersJ = {
						{1,1,1},
						{11,11,11},
						{111,111,111}
				}
		;		
				numbersB[0][0] = 1;
				numbersB[0][1] = 1;
				numbersB[0][2] = 1;

				numbersB[1][0] = 11;
				numbersB[1][1] = 11;
				numbersB[1][2] = 11;

				numbersB[2][0] = 111;
				numbersB[2][1] = 111;
				numbersB[2][2] = 111;


				System.out.println(numbersB[1][1]);

				// numbersJ

				for(int i = 0 ; i < numbersJ.length ; i++) {
					int [] ray = numbersJ[i];
					for(int j = 0 ; j < ray.length ; j++) {
						System.out.println(ray[j]);
					}
				}
	}

}
