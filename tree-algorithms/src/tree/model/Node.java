package tree.model;

public class Node {
	private Data data;
	private Node next;
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}


}
