import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[] {6,18,24,67,78};
		
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		System.out.println("\nEnter the elements you want to search::");
		int key=sc.nextInt();

		int i = Arrays.search(arr,key);
		if(i==-1)
		{
			System.out.println("element not found" );
		}
		else
		{
			System.out.println("element found at index :"+i);
		}
		
	}
	
	

}
