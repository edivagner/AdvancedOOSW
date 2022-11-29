package ie.gmit.dip;
public class Runner {

	public static void main(String[] args) {
		
		Order o = new OrderImpl("ab-1234-cd");
		
		
		LineItem item1 = new LineItemImpl("AA1", "xyz 1 qwerty", 3, 10.15f);
		LineItem item2 = new LineItemImpl("AA2", "xyz 2 qwerty", 4, 20.25f);
		LineItem item3 = new LineItemImpl("AA3", "xyz 3 qwerty", 5, 30.35f);
		LineItem item4 = new LineItemImpl("AA4", "xyz 4 qwerty", 6, 40.45f);
		
		o.addItem(item1);
		o.addItem(item2);
		o.addItem(item3);
		o.addItem(item4);
		
		LineItem[] items = o.items();
		for (int i = 0; i < items.length; i++) {
			System.out.println("["+(i+1)+"]\t"+items[i].getItemName());
		}
		System.out.println("Total: "+o.getTotal());
	}

}
