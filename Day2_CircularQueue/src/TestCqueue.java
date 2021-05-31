
public class TestCqueue {

	public static void main(String[] args) {
		
		CircularQueue c1=new CircularQueue();
		c1.insert(10);
		c1.insert(20);
		c1.insert(30);
		c1.insert(40);
		c1.insert(50);
		System.out.println(c1);
		c1.remove();
		System.out.println(c1);
		c1.remove();
		System.out.println(c1);
		c1.remove();
		System.out.println(c1);
		c1.remove();
		System.out.println(c1);
		c1.remove();
		System.out.println(c1);
	}

}
