public class SortedArray {


	
static int getSmallValue(int [] arr,int ref)
	{
		
		int min=9999;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				if(arr[i]>ref)
				{
					min=arr[i];
				
				}
				
			}
			
			
		
		}
		
		return min;
}

public static void main(String[] args) {

		int [] arr= {-4,65,5,8,-10,-1};
		
		System.out.println("Unsorted array::");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		
		int[] brr=new int[arr.length];
		
		int value=-99999;
		for(int i=0;i<arr.length;i++)
		{
			value=getSmallValue(arr,value);
			brr[i]=value;
		}
		
		System.out.println("\nsorted array::");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"\t");
		}

	}

}