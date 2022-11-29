package ie.gmit.dip;

import java.util.*;
public class MapRunner {
	
	private Map<String, Integer> table = new HashMap<String, Integer>();
	
	public void process(String[] words) {
		for (String word : words) {
			String lcWord = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
			
			int frequency = 1;
			
			if (table.containsKey(lcWord)) {
				frequency = table.get(lcWord);
				frequency++;
			}
			table.put(lcWord, new Integer(frequency));
		}
		System.out.println(table);
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(table);
		System.out.println(sortedMap);
		
		Set<String> keys = new TreeSet<String>(table.keySet());
		
		for (String key : keys) {
			int number = table.get(key);
		}
		
		Collection<Integer> value = table.values();
		for (Integer val : value) {
			System.out.print(val + ", ");
		}
		
	}
	
	public static void main(String[] args) {

		new MapRunner().process(args);
	}

}
