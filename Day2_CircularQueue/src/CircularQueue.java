import java.util.Arrays;

public class CircularQueue {

		int []cqueue;
		int front;
		int rear;
		
		
		public CircularQueue()
		{
			cqueue=new int[5];
			front=rear=-1;
		}
		public CircularQueue(int size)
		{
			cqueue=new int[size];
			front=rear=-1;
		}
		public void insert(int data)
		{
			if(front==0 && rear==cqueue.length-1 || rear+1==front)
			////if rear is at last position then you want add element from rear
				//it is mandatory to check if rear+1 ==front 					
			{
				System.out.println("cqueue is full");
			}
			else
			{
				if(front==-1 && rear==-1)
				{
					front=rear=0;
					cqueue[rear]=data;
				}
				
				else if(rear==cqueue.length-1)
					{
					//we reached at last position so to insert from rear you make first rear=0;
					
						//rear= ( (++rear) % cqueue.length);
						rear=0;
						cqueue[rear]=data;
					}
					else
					{
						rear=rear+1;
						cqueue[rear]=data;
					}
				}
		}
		
		public int remove()
		{
			int data=0;
			if(front==-1 && rear==-1)
			{
				System.out.println("cqueue is empty");
			}
			else
			{
				if(front==rear)
				{
					front=rear=-1;
				}
				else if(front==cqueue.length-1)
				{
					front=0;
					data=cqueue[front];
				}
				else
				{
					data=cqueue[front];
					front=front+1;
				}
			}
			return data;
		}
		public String toString() {
			String str = "";
			str += "F=" + front + ", R=" + rear + "\n";
			if(front== -1)
			{
				str += "Queue is empty!\n";
				
			}
			else
			{
				int i=front;
				while(true)
				{
					str += cqueue[i] + ", ";
					//i = (++i)%arr.length-1;
					
					if(i == rear)
						break;
					
					if(i == cqueue.length-1)
						i=0;
					else
						i = i+1;
					
				}
				str += "\n";
			}
			return str;
		}
		
		
}

