package ie.gmit.dip;

import java.util.*;

public class Book {
	
	// instance variables
	private String title;
	private String author;
	private String isbn;
	private Date pubDate;
	private float price;

	// Constructors

	// Null constructor
	public Book() {
		super();
	}

	// A constructor parameterized with a title
	public Book(String title) {
		super();
		this.title = title;
	}

	// A constructor parameterized with a title, author, isbn and date
	public Book(String title, String author, String isbn, Date pubDate) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pubDate = pubDate;
	}

	// Methods

	// Accessor(get/set) methods for title and price
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// Over-ride the toString() method inherited from Object to return the title of
	// the book

	// Over-ride the equals() method inherited from Object to return true if two
	// books have the same title

}
