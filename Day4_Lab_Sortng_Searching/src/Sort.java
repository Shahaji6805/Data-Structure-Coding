
public class Sort {
	
	
	public static void main(String[] args){
		

	int[] arr=new int[] {12,-4,45,-22,67,-43,99,55};
	
	Arrays.display(arr);
	
	//Arrays.selectionSort(arr);
	//Arrays.display(arr);
	System.out.println();
	
	//Arrays.bubbleSort(arr);
	Arrays.insertionSort(arr);
	Arrays.display(arr);
	
	
	
	
	}
}
