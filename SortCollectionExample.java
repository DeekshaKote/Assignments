package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class SortCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();	
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Loin");
		animals.add("snake");
		animals.add("Tiger");
		
		
		Collections.sort(animals,Collections.reverseOrder());
	System.out.println(animals);

	}

	

}
