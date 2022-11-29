package ie.gmit.dip;

import java.util.Objects;

public class LineItemImpl implements LineItem{
	// Instance Variable
	private String number;
	private String name;
	private int qty;
	private float price;
	
	// null constructor
	public LineItemImpl() {
		super();
	}
	
	//parameterized constructor with number and name
	public LineItemImpl(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	//parameterized constructor with number, name, qty, price
	public LineItemImpl(String number, String name, int qty, float price) {
		super();
		this.number = number;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	// methods get/set
	public void setItemNumber(String number) {
		this.number = number;
	}

	public String getItemNumber() {
		return this.number;
	}

	public void setItemName(String name) {
		this.name = name;
	}

	public String getItemName() {
		return this.name;
	}

	public void setItemQuantity(int qty) {
		this.qty = qty;
	}

	public int getItemQuantity() {
		return this.qty;
	}

	public void setItemPrice(float price) {
		this.price = price;
	}

	public float getItemPrice() {
		return this.price;
	}

		
}
