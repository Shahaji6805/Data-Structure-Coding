package sorting_technique;

public class selectionSort {


	static void SelctionSort(int[] arr, boolean Desc) {
		
		for(int i=0;i<arr.length-1;i++)
		{
			int sval=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(Desc)
				{
					if(arr[j]>sval)
					{
						int temp=sval;
						sval=arr[j];
						arr[j]=temp;
					}
				}
				else
				{
					if(arr[j]<sval)
					{
						int temp=sval;
						sval=arr[j];
						arr[j]=temp;
					}
				}
			}
			arr[i]=sval;
		}
		
	}
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int[] arr=new int[] {34,2,67,1,99};
		SelctionSort(arr,false);
		printArray(arr);
	}
	
	

}


