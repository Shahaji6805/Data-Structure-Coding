
public class TestDqueue {

	public static void main(String[] args) {
		
		DQueue d1=new DQueue();
		
		d1.insertFromRear(11);
		d1.insertFromRear(23);
		System.out.println(d1);
		
		d1.insertFromFront(55);
		d1.insertFromFront(99);
	
		System.out.println(d1);
		d1.removeFromFront();
		d1.removeFromFront();
		System.out.println(d1);
		d1.removeFromRear();
		d1.removeFromRear();
		d1.removeFromFront();
		System.out.println(d1);
	}

}
