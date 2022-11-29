package ie.gmit.dip;

import java.util.*;

public interface BookLibrary {
	
	//Interface are declarative and completely abstract
	//define methods getter and setters
	
	public String getTitle();
	public void setTitle(String title);
	
	public String getAuthor();
	public void setAuthor(String author);
	
	public String getIsbn();
	public void setIsbn(String isbn);
	
	public Date getPubDate();
	public void setPubDate(Date pubDate);
	
	public float getPrice();
	public void setPrice(float price);	

}
