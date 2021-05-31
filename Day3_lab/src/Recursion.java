
public class Recursion {

	public static void main(String[] args) {

		recursivePrint(1);

	}

	static void recursivePrint(int a)
	{
		System.out.print(a+" ");
		if(a>=5)
		{
			return;
		}
		recursivePrint(a+1);
	}
}
