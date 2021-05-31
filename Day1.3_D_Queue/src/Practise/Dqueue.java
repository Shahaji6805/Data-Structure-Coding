package Practise;

public class Dqueue {
	
	int [] dequeue;
	int front;
	int rear;
	
	public Dqueue()
	{
		dequeue=new int[10];
		front=rear=-1;
	}
	public Dqueue(int size)
	{
		dequeue=new int[size];
		front=rear=-1;
	}
	public void insetFromRear(int data)
	{
		if(rear==dequeue.length-1)
		{
			System.out.println("dequeue is full");
			if(front==0)
			{
				System.out.println("dequeue if full");
			}
			else
			{
				//when front is not in zero position
				//then we have to shift all elements 
				for(int i=front;i<=rear;i++)
				{
					dequeue[i+1]=dequeue[i];
				}
				front=front-1;
				dequeue[rear]=data;
			}
		}
		else
		{
			//if we dont have elements in the queue
			if(front ==-1 && rear==-1)
			{
				front=rear=0;
				dequeue[rear]=data;
				
			}
			else
			{
				rear=rear+1;
				dequeue[rear]=data;
				
			}
			
		}
		
		
	}
	public void insertFromFront(int data)
	{
		if(front==0 && rear==dequeue.length-1)
		{
			System.out.println("dequeue is full");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front=rear=0;
				dequeue[front]=data;
			}
			else
			{
				if(front==0)
				{
					for(int i=rear;i>=front;i--)
					{
						dequeue[i+1]=dequeue[i];
					}
					rear=rear+1;
					dequeue[front]=data;
				}
				else
				{
					front=front-1;
					dequeue[front]=data;
					
				}
			}
		}
	}
	public int removeFromfront()
	{
		int data=0;
		if(front==-1 && rear==-1)
		{
			System.out.println("dqueue is empty ");
		}
		else
		{
			if(front ==rear)
			{
				data=dequeue[front];
				front=rear=-1;
			}
			else
			{
				data=dequeue[front];
				front=front+1;
			}
		}
		return data;
	}
	public int removeFromRear()
	{
		int data=0;
		if(front==-1 && rear==dequeue.length-1)
		{
			System.out.println("dequeue is empty");
		}
		else
		{
			if(front==rear)
			{
				data=dequeue[rear];
				front=rear=-1;
			}
			else
			{
				data=dequeue[rear];
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
			System.out.println("dequeue is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				str=str+dequeue[i]+"\t";
			}
		}
		return str;
		
	}

}
