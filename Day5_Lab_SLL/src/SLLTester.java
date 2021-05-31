
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

		s1.addByPosition(200, 2);
		System.out.println(s1);
		
		s1.addByPosition(500, 6);
		System.out.println(s1);
		
		s1.deleteByPosition(1);
		System.out.println(s1);
		
		s1.deleteByPosition(9);
		System.out.println(s1);

	}

}
