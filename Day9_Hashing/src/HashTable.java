
public class HashTable {
	
	Integer[] arr=new Integer[10];
	
	public void put(Integer key)
	{
		int index=hash(key);
		while(arr[index] !=null && arr[index] !=key)
		{
			index=index+1%arr.length;
		}
		arr[index]=key;
		
	}

	//hash function
	private int hash(Integer  key)
	{
		return key%arr.length;
	}
	public void display()
	{
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" \t");
		}
	}
}
