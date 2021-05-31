import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StackWithOop s1 = new StackWithOop();
		
		s1.push(11);
		s1.push(22);
		s1.push(33);
		s1.push(44);
		s1.push(55);
		s1.push(66);
		System.out.println(s1);
		s1.pop();
		s1.pop();
		System.out.println(s1);
		
		

	}

}
