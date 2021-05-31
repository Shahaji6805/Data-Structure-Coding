
public class QuickSorting {

	public static void Quick_Sort(int[] arr, int left, int right) {
		if (left >= right)
			return;

		int i = left;
		int j = right;

		while (i < j) {

			while (i <= right && arr[i] <= arr[left])
			{
				i++;
			}
			while (arr[j] > arr[left])
			{
				j--;
			}
			if (i < j) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

		// 5.swap j th ele with pivot
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;

		// 6.apply quick sort to the left partition (i.e l to j-1)

		Quick_Sort(arr, left, j - 1);
		Quick_Sort(arr, j + 1, right);
	}

	public static void main(String[] args) {

		int[] arr = { 67, 54, 86, 21, 77, 34, 87, 45, 92, 86 };

		Quick_Sort(arr, 0, arr.length-1);

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " \t");
		}

	}

}