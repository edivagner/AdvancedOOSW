package ie.gmit.dip;

import java.util.*;

public class Runner {

	public static void main(String[] args) {

		 List<Book> books = new ArrayList<Book>();
		
		 
		//Test 1
		 String s = "Happy Days";
		 String t = "Happy Days";
		//s == t; //True 
		 System.out.println(s == t);		 
		 //s.equals(t); //True 
		 System.out.println(s.equals(t));
		 
		 //Test 2
		String s1 = "Happy Days";
		 String t1 = new String ("Happy Days");
		 ///s == t; //false 
		 System.out.println(s1 == t1);		 
		 //s.equals(t); //True 
		 System.out.println(s1.equals(t1));
		 
		 
		 //Test 3
		 String s2 = new String ("Happy Days");
		 String t2 = new String ("Happy Days");
		///s == t; //false 
		 System.out.println(s2 == t2);		 
		 //s.equals(t); //false 
		 System.out.println(s2.equals(t2));

	}

}
