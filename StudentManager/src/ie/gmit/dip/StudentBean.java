package ie.gmit.dip;

import java.time.LocalDate;

public class StudentBean { // a Bean class, wrap fields and constructors getters and setters (mutable objects because get/set)

	//G0>>Samantha>>O'Reilly>>-785371626869>>Physics>>Longford
	private String id;
	private String firstName;
	private String surname;
	private LocalDate dob;
	private String course;
	private String county;
	
	public StudentBean() {
		super();
	}

	public StudentBean(String id) {
		this.id = id;
	}

	public StudentBean(String id, String firstName, String surname, LocalDate dob, String course, String county) {
		this(id);
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.course = course;
		this.county = county;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", surname=" + surname + "]";
	}
	
	
	
	
}
