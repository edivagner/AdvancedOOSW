package ie.gmit.dip;
import java.util.*;
public class ListIteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i =0; i< 1000; i++) {
			list.add("G00"+i);
		}
		Iterator<String> i = list.iterator();// ask the list for an iterator
		while(i.hasNext()) { // iterate over the collection
			String element = i.next(); //get the next element
			// do something with element
			System.out.println(element);
		}
		
		System.out.println("************************************************");
		for (int j = 0; j < list.size(); j++) {
			String element = list.get(j);
			// do something with element
			System.out.println(element);
		}
		
		System.out.println("************************************************");
		for (String element : list) { // for each String element in the list
			// do something with element
			System.out.println(element);
		}
	}

}
