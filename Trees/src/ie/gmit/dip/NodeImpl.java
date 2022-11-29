package ie.gmit.dip;

import java.util.*;

public class NodeImpl<T> implements Node<T>{
	private Node<T> parent;
	private List<Node<T>> children = new ArrayList<Node<T>>();
	private T data;

	public NodeImpl(Node<T> parent, T data) {
		super();
		this.parent = parent;
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public boolean isRoot() {
		return this.parent == null;
	}
	public boolean isLEaf() {
		return children.isEmpty();
	}
	public Node getParent() {
		return this.parent;
	}
	public List children() {
		return this.children;
	}
	public void addChild(Node child) {
		children.add(child);
	}
	
	public void removeChild(Node child) {
		children.remove(child);
	}
	public boolean hasChild(Node child) {
		return children.contains(child);
	}
	public boolean hasSibling() {
		if (!isRoot()) {
			return parent.children().size() > 1;
		}
		return false;
	}
	public List<Node<T>> siblings() {
		List<Node<T>> siblings = parent.children();
		siblings.remove(this);
		return siblings;
	}

}
