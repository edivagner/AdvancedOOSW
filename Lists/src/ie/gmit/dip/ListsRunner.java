package ie.gmit.dip;

import java.util.*;

public class ListsRunner {
	
	public void ListExamples(){
		ArrayList<String> list1 = new ArrayList<String>(); // creates a list to store Strings.
		LinkedList<String> list2 = new LinkedList<String>();// also creates a list to store Strings.
		List<String> list3 = new ArrayList<String>(); // The best way to create a list to store Strings.
		list3 = new LinkedList<String>();// we can always swap the abstraction if we want to.
		list3 = new Vector<String>(); // Vector is a legacy class and should be avoided
		List list4 = new ArrayList();//This will work fine(with warnings), but is weakly typed.
		List<Integer> list5 = new ArrayList<>(); //Any object type can be used in a Collection
		//List<Student> list6 = new ArrayList<Student>();
		List<List<Integer>> list7 = new ArrayList<List<Integer>>();// use to interfaces
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // create a list to Store Strings
		
		for(int i = 0; i<1000; i++) {
			list.add("G00" + i);
		}
		System.out.println("The list has " + list.size() + " elements.");		
		System.out.println(list.get(77));
		list.remove(77);
		System.out.println(list.get(77));
		int index = list.indexOf("G009999");
		System.out.println(index);
		boolean hasElement = list.contains("G009999");
		System.out.println(hasElement);
		list.set(100, "G009999");
		hasElement = list.contains("G009999");
		System.out.println(hasElement);
		index = list.indexOf("G009999");
		System.out.println(index);

	};
};
