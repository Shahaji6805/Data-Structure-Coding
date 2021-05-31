package Practise_1;

public class TesterDqueue {

	public static void main(String[] args) {


		Dqueue d1=new Dqueue();
		d1.insertFromRear(466);
		d1.insertFromRear(23);
		System.out.println(d1);
		d1.insertFromFront(86);
		d1.insertFromRear(76);
		d1.insertFromFront(3333);
		System.out.println(d1);
		d1.removeFromRear();
		d1.removeFromRear();
		System.out.println(d1);
	
	}

}
