
public class QuickSortPractise {

	public static void QuickSort(int [] arr,int left,int right)
	{
		
		if(left >= right)
		{
			return;
		}
		int i=left;
		int j=right;
		
		while(i < j)
		{
			while( i <=right && arr[i] <= arr[left])
			{
				i++;
			}
			while(arr[j] > arr[left])
			{
				j--;
			}
			//swap the i th and j th ele 
			if(i < j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		int temp=arr[left];
		arr[left]=arr[j];
		arr[j]=temp;
		
		QuickSort(arr, left,j-1);
		QuickSort(arr, j+1, right);
	}
	public static void main(String[] args) {
	
		int[] arr= {7,3,9,2,11,6,21,4,67,1};
		
		QuickSort(arr,0,arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
			
		}
	}
	

}
