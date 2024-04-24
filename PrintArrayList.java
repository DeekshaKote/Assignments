package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class PrintArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet<String> names = new TreeSet<String>();
	//	ArrayList<String> names = new ArrayList<String>();	
		HashMap<Integer,String> names= new HashMap<Integer,String>();
		
		names.put(1,"Raju");
		names.put(2,"Raju");
		names.put(3,"Bolu");
		
		System.out.println(names.get(3));
	}

}
