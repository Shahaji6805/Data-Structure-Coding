package concatearray;

public class concateAndSort {

	  static int i=0;
		static 	int j=0;
			 
	
	 static int getSmallValue(int []arr1,int []arr2)
	 {

		
		 if(i<arr1.length && j<arr2.length)
		 {
			 int m1=arr1[i];
			 int m2=arr2[j];
			 
			 if(m1<m2)
			 {
				 i++;
				 return m1;
			 }
			 else
			 {
				 j++;
				 return m2;
			 }
		 }
		 else
		 {
			 //it will return last value 
			 if(i==arr1.length)
			 {
				 int a=arr2[j];
				 j++;
				 return a;
			 }
			 else
			 {
				 int a=arr1[i];
				 i++;
				 return a;
			 }
		 }
	 }

	
	
	
	
	public static  void main(String[] args)
	{
		//array1 and array2 to must be sorted 
		int [] arr1= {-2,21,40,100};
		int [] arr2= {4,35,45,56,99,999};
		
		int size=arr1.length + arr2.length;
		int brr[]=new int[size];
		
		int value=0;
		for(int i=0;i<brr.length;i++)
		{
			value=getSmallValue(arr1,arr2);
			brr[i]=value;
		}
		
		System.out.println("Sorted array::");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"\t");
		}
	}
}
