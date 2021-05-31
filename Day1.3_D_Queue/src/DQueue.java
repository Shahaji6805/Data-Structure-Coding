
public class DQueue {

	int dequeue[];
	int front;
	int rear;
	
	public DQueue()
	{
		this.dequeue=new int[4];
		front=rear=-1;
	}
	public DQueue(int size)
	{
		this.dequeue=new int[size];
		front=rear=-1;
	}
	public void insertFromRear(int data)
	{
		if(rear==dequeue.length-1)
		{
			System.out.println("dequeue is full");
			if(front ==0)
			{
				System.out.println("dequeue is full");
			}
			else
			{
				//we have space before front
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
			if (front==-1 && rear==-1)
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
			System.out.println("queueuis full ");
		}
		else
		{
			if(front==-1)
			{
				front=front+1;
				dequeue[front]=data;
			}
			else
			{
				if(front==0)
				{
					//we have not space before front
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
	public int removeFromFront()
	{
		int data=0;
		if(front ==-1 && rear==-1)
		{
			System.out.println("dequeue is empty!!!");
		}
		else
		{
			if(front==0)
			{
				data=dequeue[front];
				front=front+1;
			}
			else
			{
				if(front == rear)
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
		}
		return data;
	}
	public int removeFromRear()
	{
		int data=0;
		if(front ==-1 && rear==-1)
		{
			System.out.println("dequeue is empty!!!");
		}
		else
		{
			if(rear==front)
			{
				data=dequeue[rear];
				rear=front=-1;
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
			System.out.println("dqueue is empty");
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
