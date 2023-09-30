package collections;

import java.util.ArrayList;
import java.util.Collections;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>listA = new ArrayList<>();
		listA.add(12);
		listA.add(13);
		listA.add(14);
		listA.add(15);
		System.out.println(listA);
		
		// Array List of String 

				ArrayList<String>names  = new ArrayList<>();
				
				// add the element
				names.add("kalyani");
				names.add("prasad");
				names.add("aryan");
				names.add("shivaji");
				names.add("dhanvi");
				System.out.println(names);


				
				// retrieve the element 
				System.out.println(names.get(0));
				System.out.println(names.get(1));
				System.out.println(names.get(3));
				System.out.println(names.get(4));
				System.out.println(names.get(2));



				for(int i = 0 ; i < names.size() ; i++ ) {
					System.out.println(i);
					System.out.println(names.get(i));
				}

				// update the element 
				names.set(3, "samrudhhi");
				System.out.println(names.get(2));

				// updating the value at particular index

				names.remove(3);
				System.out.println(names);


				// Methods

				ArrayList<String>names2  = new ArrayList<>();
				names2.add("vaishnavi");
				names2.add("santosh");
				names2.add("sai");
				names2.add("om");
				names2.add("shreya");


				// size()

				int aa = names2.size();
				System.out.println(aa);
				System.out.println(names2);

				// sort()

				Collections.sort(names2);
				System.out.println(names2);

				// isEmpty()
				boolean b = names2.isEmpty();
				System.out.println(b);

				ArrayList<String>names3  = new ArrayList<>();
				boolean c = names3.isEmpty();
				System.out.println(c);

				names3.add("adhrva");
				names3.add("ram");
				names3.add("sham");

				// indexOf()
				int ia = names3.indexOf("ram");
				System.out.println(ia);

				// contains()
				boolean ia2 = names3.contains("sham");
				System.out.println(ia2);














	}

}
