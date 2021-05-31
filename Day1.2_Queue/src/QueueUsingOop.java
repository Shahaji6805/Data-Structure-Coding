
public class QueueUsingOop {

	int queue[];
	int front;
	int rear;

	public QueueUsingOop() {
		queue = new int[5];
		front = rear = -1;
	}

	public QueueUsingOop(int size) {
		queue = new int[size];
		front = rear = -1;
	}

	public void insert(int data)
	{
		if (rear == queue.length - 1) 
		{
			System.out.println("Queue is full");
		} 
		else
		{
			if (front ==-1 && rear == -1)
			{
				front=0;
				rear = 0;
				queue[rear] = data;
			}
			else
			{
				rear=rear+1;
				queue[rear]=data;
			}
		}
	}
	public int remove()
	{
		int data=0;
		if(front==-1 && rear== -1)
		{
			System.out.println("Queue is empty!!!!");
		}
		else
		{
			if(front==queue.length-1 && rear == queue.length-1)
			{
				data=queue[front];
				front=rear=-1;
			
			}
			else
			{
				data=queue[front];
				front=front+1;
			}
			
			
		}
		return data;
	}
	public boolean isEmpty()
	{
		if(front==-1 && rear == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEqual(QueueUsingOop q2)
	{
		if(this.queue.length == q2.queue.length )
		{
			for(int i=front;i<=rear;i++)
			{
				if(this.queue[i]==q2.queue[i])
				{
					continue;
				}
				return false;
			}
			return true;
	
		
		}
		return false;
	}
	public String toString()
	{
		String str="\n";
		for(int i=front;i<=rear;i++)
		{
			str=str+queue[i]+"\t";
		}
		return str;
	}
}
