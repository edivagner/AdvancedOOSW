package ie.gmit.dip;

import java.util.*;

public class OrderImpl implements Order{
	private String orderNum;
	private Date orderDate = new Date();
	private List<LineItem> items = new ArrayList<LineItem>();

	public OrderImpl(String orderNum, Date orderDate) {
		super();
		this.orderNum = orderNum;
		this.orderDate = orderDate;
	}
	public OrderImpl(String orderNum) {
		super();
		this.orderNum = orderNum;
	}
	public String getOrderNumber() {
		return this.orderNum;
	}
	public Date getOrderDate() {
		return this.orderDate;
	}
	public boolean addItem(LineItem item) {
		return items.add(item); //Delegate method
	}
	public boolean removeItem(LineItem item) {
		return items.remove(item);
	}
	public LineItem[] items() {
		LineItem[] temp = new LineItem[items.size()];
		for (int i = 0; i < items.size(); i++) {
			temp[i] = items.get(i);			
		}
		return temp;
	}
	public float getTotal() {
		float total = 0.0f;
		for (LineItem item : items) {
			total += (item.getItemQuantity() * item.getItemPrice());
		}
		return total;
	}

	
}
