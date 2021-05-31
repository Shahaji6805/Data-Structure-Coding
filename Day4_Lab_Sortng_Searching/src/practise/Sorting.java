package practise;

public class Sorting {

	public static void main(String[] args) {

		int [] arr= {34,2,77,-1,-10,66,33};
		
		//selectionSort(arr);
		//display(arr);
		//bubbleSort(arr);
		//display(arr);

	}
	
	static void selectionSort(int [] arr)
	{
		System.out.println("Selection sort:\n ");
		int minIndex;
		for(int i=0;i<arr.length;i++)
		{
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minIndex] > arr[j])
				{
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
		
	}
	static void bubbleSort(int []arr)
	{
		System.out.println("Bubble sort:");
		boolean isSwap=false;
		do
		{
			 isSwap=false;
			for (int j = 0; j < arr.length-1; j++) {
				
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					isSwap=true;
				}
				
			}
			
			
		}while(isSwap);
	}
	static void display(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		
	}
	
}

