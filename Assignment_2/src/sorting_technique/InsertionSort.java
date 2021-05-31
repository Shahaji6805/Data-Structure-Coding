package sorting_technique;

public class InsertionSort {

	static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int x = i - 1;
			while (x >= 0 && tmp < arr[x]) {
				arr[x + 1] = arr[x];
				x--;
			}

			arr[x + 1] = tmp;

		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 21, 99, -10, 1, -3 };

		insertionSort(arr);
		printArray(arr);
	}

}
