import java.util.Scanner;

public class BstTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BST b1 = new BST();
		b1.insert(50);
		b1.insert(34);
		b1.insert(10);
		b1.insert(6);
		b1.insert(78);
		b1.insert(89);
		b1.insert(45);
		b1.insert(15);

		System.out.println("Inorder :");
		b1.inorder();
		System.out.println();

		System.out.println("preorder :");
		b1.preorder();
		System.out.println();

		System.out.println("postorder :");
		b1.postorder();
		System.out.println();

		System.out.println();
		
		
		
		b1.getSmallerValue();
		b1.getLargestValue();

		System.out.println();
		//b1.printToPath(78);

		b1.delete(111);
		System.out.println("After deletion : ");
		b1.inorder();
		
		
		/*
		 * System.out.println("enter the data to find: "); int data = sc.nextInt(); Node
		 * binarySearch = b1.BinarySearch(data); if (binarySearch == null) {
		 * System.out.println("Node is not found"); } else {
		 * System.out.println("Node found: " + binarySearch.getData()); }
		 */

	}

}
