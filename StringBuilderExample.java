package Coding;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str= new StringBuilder("Welcome to Home");
		
		System.out.println(str);
		
		str.append(" Deeksha");
		
		System.out.println(str);
		
		str.insert(10, " Banglore");
		
		System.out.println(str);
		
		str.replace(10, 19, " bang");
		
		System.out.println(str);
		
		str.delete(10, 20);
		System.out.println(str);
	}

}
