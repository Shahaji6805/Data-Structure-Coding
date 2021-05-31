package Practise_1;

public class Dqueue {
	
	int dqueue[];
	int front;
	int rear;
	
	public Dqueue()
	{
		dqueue=new int[5];
		front=rear=-1;
	}
	public Dqueue(int size)
	{
		dqueue=new int[size];
		front=rear=-1;
	}
	public void insertFromRear(int data)
	{
		if( rear==dqueue.length-1)
		{
			System.out.println("queue is full");
			if(front==0)
			{
				System.out.println("dqueue is full ");
			}
			else
			{
				//we have no elements before front
				for(int i=front;i<=rear;i++)
				{
					dqueue[i-1]=dqueue[i];
				}
				front=front-1;
				dqueue[rear]=data;
				
			}
			
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=rear=0;
				dqueue[rear]=data;
			}
			else
			{
				rear=rear+1;
				dqueue[rear]=data;
				
			}
		}
		
	}
	public void insertFromFront(int data)
	{
		if(front==0 && rear==dqueue.length-1)
		{
			System.out.println("dqueue is full");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=rear=0;
				dqueue[front]=data;
			}
			else
			{
				if(front==0)
				{
					for(int i=rear;i>=front;i--)
					{
						dqueue[i+1]=dqueue[i];
					}
					rear=rear+1;
					dqueue[front]=data;
				}
				else
				{
					front=front-1;
					dqueue[front]=data;
				}
			}
		}
	}
	public int removeFromFront()
	{
		int data=0;
		if(front==-1 && rear==-1)
		{
			System.out.println("dqueue is empty");
		}
		else
		{
			if(front ==rear)
			{
				data=dqueue[front];
				front=rear=-1;
			}
			else
			{
				data=dqueue[front];
				front=front+1;
			}
		}
		return data;
	}
	public int removeFromRear()
	{
		int data=0;
		if(front==-1 && rear==-1)
		{
			System.out.println("dqueue is empty");
		}
		else
		{
			if(rear==front)
			{
				data=dqueue[rear];
				front=rear= -1;
			}
			else
			{
				data=dqueue[rear];
				rear=rear-1;
			}
		}
		return data;
	}
	public String toString()
	{
		String str="\n";
		if(front==-1 && rear==-1)
		{
			System.out.println("dqueue is empty");
		}
		else
		{
			for (int i = front; i <=rear; i++) 
			{
				str=str+dqueue[i]+"\t";
			}
		}
			return str;
	}
	

}
