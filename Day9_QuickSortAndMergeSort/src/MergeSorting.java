
public class MergeSorting {

	public static void Merge_Sort(int [] arr,int left,int right)
	{
		//0.terminating condition of recursions
		
		if(left >= right)
		{
			return;
		}
		//1.devide array into two equal partition
		
		int m=(left+right) / 2;
		
		//2.
		Merge_Sort(arr, left,m);
		Merge_Sort(arr, m+1, right);
		
		//3.merge two sorted array into temp array
		int n=(right - left )+1;
		int [] temp=new int[n];
		
		int i=left;
		int j=m+1;
		int k=0;
		
		while(i <= m && j <= right)
		{
			if(arr[i] < arr[j])
			{
				temp[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
				k++;
				
			}
		}//until any one part is completed
		//if right completed then copy left over ele
		while(i<=m)
		{
			temp[k]=arr[i];
			i++;
			k++;
			
		}
		while(j<=right)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		
		//4.override temp array back to the original array
		
		for(int a=0;a<n;a++)
		{
			arr[left + a]=temp[a];
		}
		
}
	
	public static void main(String[] args) {


		int [] arr= {23,21,67,44,98,33,76};
		
		System.out.println("Before sorting:\n ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
			
		}
		System.out.println();
		Merge_Sort(arr,0,arr.length-1);
		
		System.out.println("After sorting:\n");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+"\t");
		}
		
	}

}
