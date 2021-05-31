
public class DoublyLinkeLiIst {

	private Node head;
	private Node tail;

	private static int count = 0;

	public DoublyLinkeLiIst() {

		this.head = null;
		this.tail = null;
	}

	public void addAtLast(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			tail = nn;

		} else {
			nn.setPrev(tail);
			tail.setNext(nn);
			tail = nn;

		}
	}

	public void addAtFirst(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			tail = nn;

		} else {
			head.setPrev(nn);
			nn.setNext(head);
			head = nn;

		}
	}

	public void removeFromLast() {
		
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}
		else if (head == tail) {
			tail = null;
			head = null;
			return;
		}
		else
		{
			Node temp=tail;
			tail = temp.getPrev();
			tail.setNext(null);
			
			temp.setPrev(null);
			temp = null;
			
		}
}
	public void removeFromFirst() {
		if (head == null) {
			System.out.println("DLL is empty");
		}
		if (head == tail) {
			// only one node is present
			tail = null;
			head = null;
		} else {
			Node temp = head;
			head = temp.getNext();
			temp.setPrev(null);
			temp.setNext(null);
			temp = null;

		}

	}

	public void addByPosition(int data, int pos) {
		Node nn = new Node(data);
		int count = getCount();

		if (head == null || pos == 1) {
			addAtFirst(data);
			return;
		}
		if (pos == count + 1) {
			addAtLast(data);
			return;
		} else if (pos > 1 && pos <= count) {
			Node ep = head;
			for (int i = 1; i < pos; i++) {
				ep = ep.getNext();
			}
			Node temp = ep.getPrev();
			nn.setPrev(temp);
			nn.setNext(ep);
			ep.setPrev(nn);
			temp.setNext(nn);
		} else {
			System.out.println("Invalid Position");
		}

	}

	public void removeByPosition(int pos)
	{
		int count=getCount();
		
		if (head == null) 
		{
			System.out.println("DLL is empty");
			return;
		}
		if (pos == 1)
		{
			removeFromFirst();
			return;

		}
		if (count == pos)
		{
			
			removeFromLast();
			return;
		}
		else if(pos >count)
		{
			System.out.println("Invalid position");
			return;
		}
		else if(pos>1 && pos<count)
		{
			
			Node ep = head;
			for (int i = 1; i < pos; i++) 
			{
				if(ep.getNext() ==null)
				break;
				ep = ep.getNext();
			}
			Node tn=ep.getNext();
			Node tp=ep.getPrev();
			tp.setNext(tn);
			if(tn!=null)
			{
				tn.setPrev(tp);
			}
			
			ep.setPrev(null);
			ep.setNext(null);
			ep=null;
		}
}
	public void reversePrint()
	{
		Node ep=head;
		while(ep.getNext() !=null)
		{
			ep=ep.getNext();
		}
		Node temp=ep;
		while(temp.getPrev()!= null)
		{
			System.out.print(temp.getData()+"\t");
			temp=temp.getPrev();
		}
		//System.out.print(temp.getData()+" ");
	}

	public void reverseDll()
	{
		
		System.out.println("In function reverse");
		Node tn=head;
		
		
		while(tn !=null)
		{
			Node temp=tn.getNext();
			tn.setNext(tn.getPrev());
			tn.setPrev(temp);
			tn=tn.getPrev();
			
		}
		
		Node temp=head;
		head=tail;
		tail=temp;
	}
	public int getCount() {
		int count = 0;
		
		Node ep = head;
		while (ep != null) {

			count++;
			ep = ep.getNext();

		}
		return count;
	}

	public String toString() {
		String str = " ";
		if (head == null) {
			str = "DLL is empty";
		} else {
			Node ep = head;
			while (ep != null) {
				str = str + ep.getData() + " \t";
				ep = ep.getNext();
			}
			//str = str + ep.getData() + " \t";
		}
		return str;
	}

}
