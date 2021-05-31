
public class CircularLinkedList {

	private Node head;
	private static int count = 0;

	public CircularLinkedList() {

		head = null;
	}

	public void insertAtLast(int data) {
		Node nn = new Node(data);
		// special case: if list is empty new node itself is first node
		if (head == null) {
			head = nn;
			nn.setNext(head);
			count++;
		} else {
			// traverse till last node
			Node ep = head;
			while (ep.getNext() != head) {
				ep = ep.getNext();
			}
			// new node to head
			nn.setNext(head);
			// add new node to the last of node
			ep.setNext(nn);
			count++;
		}
	}

	public void insertAtFirst(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			nn.setNext(head);
			count++;
		} else {
			Node ep = head;
			while (ep.getNext() != head) {
				ep = ep.getNext();
			}
			nn.setNext(head);
			ep.setNext(nn);
			count++;
		}
		// update head to the new node
		head = nn;
	}

	public void removeFromFirst() {
		if (head == null) {
			System.out.println("CircularLinkedList is empty");
			return;
		
		}
		if(head ==head.getNext())
		{
			head=null;
			return;
		}
		else 
		{
			Node ep = head;
			while (ep.getNext() != head) {
				ep = ep.getNext();
			}
			ep.setNext(head.getNext());
			head = head.getNext();
			count--;
		}

	}

	public void removeFromLast() {
		if (head == null) {
			System.out.println("CircularLinkedList is empty!!!!! ");
		} 
		if(head ==head.getNext())
			{
				head=null;
				return;
			}
		else {
			Node ep = head;

			while (ep.getNext().getNext() != head) {
				ep = ep.getNext();

			}

			Node temp = ep.getNext();
			temp = null;

			ep.setNext(head);
			count--;
		}
	}

	public void addAtPosition(int data, int pos) {
		Node nn = new Node(data);
		if (pos > count) {
			System.out.println("Invalid Position");
			return;
		}
		if (head == null || pos == 1) {
			insertAtFirst(data);
			return;

		} else {
			Node ep = head;
			for (int i = 1; i < pos - 1; i++) {
				if (ep.getNext() == head)
					break;

				ep = ep.getNext();
			}
			nn.setNext(ep.getNext());
			ep.setNext(nn);
			count++;
		}

	}

	public void removeFromPosition(int pos) {
		if (head == null || pos < 1) {
			System.out.println("linked list is empty!!");
			return;
		}
		if(pos > count)
		{
			System.out.println("Invalid Position");
			return;
		}
		if(pos==1)
		{
			removeFromFirst();
			return;
		}
		if(pos==count)
		{
			removeFromLast();
			return;
		}
		else
		{
			Node ep=head;
			for(int i=1;i<pos-1;i++)
			{
				ep=ep.getNext();
			}
			Node temp=ep.getNext();
			ep.setNext(temp.getNext());
			temp=null;
			count--;
			
		}
		

	}

	private boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		String str = " ";
		if (isEmpty()) {
			str = " SLL is empty";
		}

		Node ep = head;
		do {
			if(head !=null)
			{
				str = str + ep.getData() + " ";
				ep = ep.getNext();
			}
			

		} while (ep != head);
		return str;
	}

}
