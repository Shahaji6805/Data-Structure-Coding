
public class SLLTester {

	public static void main(String[] args) {

		SinglyLinkedList s1 = new SinglyLinkedList();

		s1.insertAtFirst(23);
		s1.insertAtFirst(25);
		s1.insertAtFirst(56);
		s1.removeFromEnd();
		s1.insertAtFirst(78);
		s1.insertAtLast(99);
		s1.insertAtFirst(50);
		s1.removeFromEnd();
		s1.insertAtFirst(32);
		System.out.println(s1);
		System.out.println();

		s1.removeFromEnd();
		System.out.println(s1);
	
		s1.addByPosition(400, 3);
		System.out.println(s1);
		
		
	
		

		System.out.println("Max number in LL: " + s1.getMaxValue());
		System.out.println("Min number in LL: " + s1.getMinValue());

		
		  SinglyLinkedList s2 = new SinglyLinkedList(s1);
		  
		  System.out.println("**** s1 and s2 should be same ****");
		  System.out.println(s1); 
		  System.out.println(); 
		  System.out.println(s2);
		  System.out.println("**********************");
		  
		  
		  SinglyLinkedList s3 = new SinglyLinkedList(s2);
		  
		  System.out.println(s3);
		  
		  s3.removeFromBeg(); 
		  s3.removeFromBeg(); 
		  s3.removeFromBeg();
		  System.out.println(s3);
		  s3.insertAtLast(200);
		  
		  System.out.println(s3);
		  
		 
		  
		 

	}

}
