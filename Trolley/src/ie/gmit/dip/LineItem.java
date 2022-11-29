/**
 * 
 */
package ie.gmit.dip;

/**
 * @author ediva
 *
 */
public interface LineItem {
	
	public void setItemNumber(String number);
	public String getItemNumber();
	
	public void setItemName(String name);
	public String getItemName();
	
	public void setItemQuantity(int qty);
	public int getItemQuantity();
	
	public void setItemPrice(float price);
	public float getItemPrice();

}
