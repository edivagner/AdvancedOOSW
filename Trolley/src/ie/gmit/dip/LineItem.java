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
	
	public void setItemQuantity(String qty);
	public String getItemQuantity();
	
	public void setItemPrice(String price);
	public String getItemPrice();

}
