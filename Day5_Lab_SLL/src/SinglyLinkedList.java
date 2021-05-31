 
public class SinglyLinkedList {

	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	

	public void insertAtFirst(int data) {

		Node nn = new Node(data);
		if (head == null) {
			tail = nn;

		}

		nn.setNext(head);
		head = nn;

	}

	public void insertAtLast(int data) {

		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			tail = nn;
		}

		tail.setNext(nn);
		tail = nn;

	}

	public void removeFromBeg() {

		if (head == null) {
			System.out.println("SLL is empty!!!");
		}

		Node temp;
		temp = head;
		head = temp.getNext();
		temp.setNext(null);

	}

	public void removeFromEnd() {

		if (head == null) {
			System.out.println("SLL is empty!!!!!");
		} else {
			Node ep = head;
			while (ep.getNext() != tail) {
				ep = ep.getNext();
			}
			Node temp = tail;
			ep.setNext(null);
			tail = ep;
			temp = null;
		}
	}

	public void addByPosition(int data, int pos) {

		Node nn = new Node(data);

		if (pos == 1) {
			System.out.println("element inserted at Position:# " + pos);
			insertAtFirst(data);
		}
		if (pos == countOfNodes()) {
			System.out.println("element inserted at Position:# " + pos);
			insertAtLast(data);
		}

		if (pos > countOfNodes()) {
			System.out.println("Invalid Position");

		} else

		{
			System.out.println("element inserted at Position:# " + pos);
			Node ep = head;
			for (int i = 1; i < pos - 1; i++) {
				ep = ep.getNext();
			}
			nn.setNext(ep.getNext());
			ep.setNext(nn);
		}

	}

	public void deleteByPosition(int pos) {
		System.err.println("delete by position #" + pos);
		if (head == null) {
			System.out.println("SLL is empty!!");
		}

		if (pos == 1) {
			removeFromBeg();
		}
		if (pos == countOfNodes()) {
			removeFromEnd();
		}
		if (pos > countOfNodes()) {
			System.out.println("Invalid Position");

		} else

		{
			Node ep = head;
			for (int i = 1; i < pos - 1; i++) {
				ep = ep.getNext();
			}
			Node temp = ep.getNext();
			ep.setNext(temp.getNext());
			temp = null;
		}

	}
	public void  PrintReverse()
	{
		 PrintReverse(head) ;
	}

	private void PrintReverse(Node it) 
	{
		
		if (it != null) 
		{
			PrintReverse(it.getNext());
			System.out.print(it.getData()+" ");
		}
		
	}

	public void reversedLinkedList()
	{
		Node it=head;
		Node itp=null;
		Node itn=head;
		
		while(it !=null)
		{
			itn=it.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
			
		}
		head=itp;
		
	}

	
	private int countOfNodes() {
		Node ep = head;
		int count = 0;
		while (ep.getNext() != null) {
			ep = ep.getNext();
			count++;
		}
		count++;
		return count;
	}

	private boolean isEmpty() {
		return head == null && tail == null;
	}
	@Override
	public String toString() {
		String str = " ";
		if (isEmpty()) {
			str = "SLL is empty";
		} else {
			Node ep = head;
			while (ep != null) {
				str = str + ep.getData() + " ";
				ep = ep.getNext();
			}
		}
		return str;
	}


}
