package Practise;

public class Tester_Dequeue {

	public static void main(String[] args) {
		
		Dqueue d1=new Dqueue();
		d1.insetFromRear(11);
		d1.insetFromRear(22);
		System.out.println(d1);
		d1.insertFromFront(35355);
		d1.insetFromRear(33);
		d1.insetFromRear(44);
		System.out.println(d1);
		d1.removeFromfront();
		d1.insetFromRear(55);
		d1.insertFromFront(9999);
		System.out.println(d1);
		d1.removeFromfront();
		d1.removeFromfront();
		d1.removeFromfront();
		System.out.println(d1);
		d1.insertFromFront(54234);
		d1.insertFromFront(645);
		System.out.println(d1);
		d1.removeFromRear();
		d1.removeFromfront();
		d1.removeFromfront();
		d1.removeFromfront();
		d1.removeFromfront();
		System.out.println(d1);
		
	}

}
