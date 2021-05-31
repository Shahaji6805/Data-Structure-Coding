
public class DllTester {

	public static void main(String[] args) {
		
		DoublyLinkeLiIst d1=new DoublyLinkeLiIst();
		
		d1.addAtLast(23);

		d1.addAtLast(56);

		d1.addAtLast(78);

		d1.addAtLast(99);
		System.out.println(d1);

		d1.addAtFirst(34);
		d1.addAtFirst(90);
		System.out.println(d1);
		
		d1.removeByPosition(1);
		System.out.println(d1);
		
		d1.removeByPosition(1);
		System.out.println(d1);
		
		//d1.reversePrint();
	
		System.out.println("reverse DLL:");
		d1.reverseDll();
		System.out.println(d1);
	}
	

}
