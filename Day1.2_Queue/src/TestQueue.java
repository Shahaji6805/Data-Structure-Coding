
public class TestQueue {

	public static void main(String[] args) {
		
		QueueUsingOop q1=new QueueUsingOop();
		
		
		q1.insert(44);
		q1.insert(11);
		q1.insert(55);
		q1.insert(33);
		q1.remove();
		
		System.out.println("Queue Elements after inserting::");
		System.out.println(q1);
		

	
		if(q1.isEmpty()) {
			
			System.out.println("Queue is empty!!!");
		}
		else
		{
			System.out.println("queue is not empty!!!");
		}
		
		
		QueueUsingOop q2=new QueueUsingOop();
		
		
		q2.insert(44);
		q2.remove();
		q2.insert(11);
		q2.insert(55);
		q2.insert(33);
	
		
		System.out.println("Queue Elements after inserting::");
		System.out.println(q2);
		//q1.remove();
		//q1.remove();
	
		if(q1.isEqual(q2)) {
			
			System.out.println("Q1 and Q2 iS equal");
		}
		else
		{
			System.out.println("Q1 and Q2 not equal");
		}
		
		
		

	}

}
