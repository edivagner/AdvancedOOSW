package ie.gmit.dip;

import java.util.*;
public interface Node<T> {
	public T getData();
	public void setDate(T data);
	
	public boolean isRoot();
	public boolean isLEaf();
	public Node<T> getParent();
	public List<Node<T>> children();
	
	public void addChild(Node<T> child);
	public void removeChild(Node<T> child);
	public void hasChild(Node<T> child);
	public boolean hasSibling();
	public List<Node<T>> siblings();	

}
