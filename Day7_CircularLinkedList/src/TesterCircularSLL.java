
public class TesterCircularSLL {

	public static void main(String[] args) {

		CircularLinkedList c1=new CircularLinkedList();
		
		c1.insertAtLast(21);
		c1.insertAtLast(45);
		c1.insertAtLast(65);
		System.out.println(c1);
		
		c1.insertAtFirst(11);
		

		c1.insertAtFirst(33);
		c1.insertAtFirst(66);
		System.out.println(c1);
		
		c1.addAtPosition(100,3);
		System.out.println(c1);
		
		c1.addAtPosition(600, 1);
		System.out.println(c1);
	
		c1.addAtPosition(240,7);
		System.out.println(c1);
		
		
		
		c1.removeFromFirst();
		System.out.println(c1);
		c1.removeFromFirst();
		c1.removeFromFirst();
		
		System.out.println(c1);
		
		c1.removeFromLast();
		System.out.println(c1);
		c1.removeFromLast();
		System.out.println(c1);
		
		c1.removeFromLast();
		System.out.println(c1);
		
		
		// c1.removeFromPosition(3); System.out.println(c1);
		
		 c1.removeFromPosition(2); System.out.println(c1);
		 
		// c1.removeFromPosition(1); 
		 //System.out.println(c1);
		
		
	}

}
