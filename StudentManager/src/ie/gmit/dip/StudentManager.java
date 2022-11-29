package ie.gmit.dip;

import java.util.*;

public class StudentManager {
	//compose and delegate
	private List<StudentRec> students = new ArrayList<StudentRec>();

	public int count() {
		return students.size(); // <<delegate method>>
	}

	public boolean isEmpty() {
		return students.isEmpty();
	}

	public boolean hasStudent(StudentRec s) {
		return students.contains(s);
	}

	public boolean add(StudentRec s) {
		return students.add(s);
	}

	public boolean remove(StudentRec s) {
		return students.remove(s);
	}

	public void deleteAll() {
		students.clear();
	}

	public StudentRec get(int index) {
		return students.get(index);
	}

	public StudentRec[] students() {
		//return students.toArray(new Student[students.size()]);
		return students.toArray(StudentRec[]::new);
	}
	
}
