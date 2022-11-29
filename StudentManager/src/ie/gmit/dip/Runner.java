package ie.gmit.dip;

import java.util.Collection;

public class Runner {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		
		System.out.println("is Empty: " + sm.isEmpty());
		System.out.println("the list has a: " + sm.count() + " Students");
		
		//StudentRecord sr = new StudentRecord(null, null, null, null, null, null);
		
		Parser p = new Parser();
		Collection<StudentRec> col = p.parse("./100-students.stuff");
		for(StudentRec s : col) {
			sm.add(s);
		}
		
		System.out.println("is Empty: " + sm.isEmpty());
		System.out.println("the list has a: " + sm.count() + " Students");

	}

}
