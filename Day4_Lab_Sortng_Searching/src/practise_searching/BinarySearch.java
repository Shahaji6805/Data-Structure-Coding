package practise_searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = {-10,-1,2,12,21,34,56,99 };
		//note: In binary search all elements should be in sordted order
		
		display(arr);

		System.out.println("\nenter the element you want to search :");
		int key=sc.nextInt();
		
		
		/*
		 * int index = binarySearch(arr,key);
		 * 
		 * if(index==-1) { System.out.println("element not found!!!"); } else {
		 * System.out.println("element found at index: "+index); }
		 */

		int l = 0;// left=0;
		int r = arr.length-1;
		
		int index = recursiveBinarySearch(arr,key,l,r);
		
		if(index==-1)
		{
			System.out.println("element not found!!!");
		}
		else
		{
			System.out.println("element found at index: "+index);
		}

	}

	/*
	 * static int binarySearch(int[] arr, int key) { int l = 0;// left=0; int r =
	 * arr.length;
	 * 
	 * while (l <= r) { int mid = (l + r) / 2;
	 * 
	 * if (key == arr[mid]) { return mid; } if (key < arr[mid]) { r= mid - 1; } else
	 * if (key > arr[mid]) { l = mid + 1; } } return -1; }
	 */
	
	static int recursiveBinarySearch(int[] arr, int key,int l,int r)
	{
		
		
		while (l <= r) 
		{
			int mid = (l + r) / 2;

				if (key == arr[mid])
				{
					return mid;
				} 
				if (key < arr[mid]) 
				{
					 return recursiveBinarySearch(arr,key,l, mid - 1);
				}
				else if (key > arr[mid])
				{
					return recursiveBinarySearch(arr,key,mid+1, r);
				}
		}
		return -1;
	}
	static void display(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		
	}

}
