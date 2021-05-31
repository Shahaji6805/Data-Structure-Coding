package sorting;

public class InsertionSort {

	public static void insertionSort(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];int j;
			for(j=i-1;j>=0 && arr[j] > key ;j--)
			{
				
				arr[j+1]=arr[j];
					
			}
			arr[j+1]=key;
			
		}
		
		
	}
	public static void main(String[] args) {

		int [] arr= {21,45,78,34,98,12,33};
		
		insertionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" \t");
		}
	}

}
