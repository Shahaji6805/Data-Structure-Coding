package singlyListStudent;

public class Node {
	
	Student data;
	Node next;
	
	public Node(Student data) {

		this.data=data;
		this.next=null;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

}
