
public class Node {
	
	Node prev;
	int data;
	Node next;
	
	Node(int data)
	{
		this.prev=null;
		this.data=data;
		this.next=null;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

}
