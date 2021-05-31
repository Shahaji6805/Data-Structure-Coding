package singlyListStudent;

public class SinglyLinkedList {

	Node head;
	
	public SinglyLinkedList() {

		this.head=null;
	}
	public void addAtLast(Student data)
	{
		Node nn=new Node(data);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			Node ep=head;
			while(ep.getNext() != null)
			{
				ep=ep.getNext();
			}
			ep.setNext(nn);
		}
		
	}
	public void addAtFirst(Student data)
	{
		Node nn=new Node(data);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			nn.setNext(head);
			head=nn;
		}
	}
	public void removeFromLast()
	{
		if(head==null)
		{
			System.out.println("linked list is empty");
			return;
		}
		if(head.getNext()==null)
		{
			head=null;
		}
		else
		{
			Node ep=head;
			while(ep.getNext().getNext() != null)
			{
				ep=ep.getNext();
			}
			Node temp=ep.getNext();
			ep.setNext(null);
			temp=null;
		}
	}
	public void removeFromFirst()
	{
		if(head==null)
		{
			System.out.println("linked list is empty");
			return;
		}
		if(head.getNext() ==null)
		{
			head=null;
		}
		else
		{
			Node temp=head;
			head=temp.getNext();
			temp.setNext(null);
			temp=null;
			
		}
	}
	public void addByPosition(int pos, Student data)
	{
		Node nn=new Node(data);
		if(pos ==1)
		{
			addAtFirst(data);
			return;
		}
		if(pos == getCount()+1)
		{
			addAtLast(data);
			return;
		}
		if(pos>getCount())
		{
			System.out.println("invalid position:");
		}
		else
		{
			Node ep=head;
			for(int i=1;i<pos-1;i++)
			{
				ep=ep.getNext();
			}
			Node temp=ep.getNext();
			nn.setNext(temp);
			ep.setNext(nn);
			
		}
		
	}
	public void removeByPosition(int pos)
	{
		if(head==null)
		{
			System.out.println("linked list empty");
			return;
		}
		if(pos==1)
		{
			removeFromFirst();
			return;
		}
		if(pos==getCount())
		{
			removeFromLast();
			return;
		}
		if(pos > getCount())
		{
			System.out.println("Invalid Position");
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
			
		}
	}
	public Student searchStudentByRollNo(int roll_no)
	{
		Node temp=head;
		while(temp !=null)
		{
			if(temp.getData().getRoll_No() == roll_no)
			{
				return temp.getData();
			}
			temp=temp.getNext();
		}
		return null;
	}
	private int getCount()
	{
		int count=0;
		Node ep=head;
		while(ep !=null)
		{
			count++;
			ep=ep.getNext();
		}
		return count;
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		Node ep=head;
		while(ep != null)
		{
			System.out.println(ep.getData());
			ep=ep.getNext();
		}
		
		System.out.println();
		
	}
	
}
