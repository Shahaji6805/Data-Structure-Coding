
public class Arrays {

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.print(arr[i] + " \t");
		}
		System.out.println();
	}

	// selection sort alogorithm
	public static void selectionSort(int[] arr) {
		System.out.println("\nSelection Sort::");
		int minIndex;
		for (int i = 0; i < arr.length; i++) {

			minIndex = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] < arr[minIndex]) {
					minIndex = k;
					// we just assign the index of minimum element
				}
			} // we swap the elements only when we found minimum element at specified index
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
	}

	public static void bubbleSort(int[] arr) {
		System.out.println("\nBubble Sort::");
		boolean isSwap = false;
		do {
			for (int i = 0; i < arr.length - 1; i++) {
				// swaping is only when left element is greater than right element
				isSwap = false;// false tells us array is sorted
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					isSwap = true;
				}

			}
		} while (isSwap);
	}

	public static void insertionSort(int[] arr) {
		int k;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (k = i - 1; k >= 0 && arr[k] > key; k--) {
				arr[k + 1] = arr[k];

			}
			arr[k + 1] = key;
		}
	}

	private static int iterativeLinearSerach(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				return i;
			}

		}
		return -1;
	}

	public static int search(int[] arr, int key) {

		//bubbleSort(arr);
		return recursiveBinarySearch(arr, key, 0, arr.length - 1);
	}

	private static int iterativeBinarySearch(int[] arr, int key, int start, int end) {
		int mid;
		for (;start <= end;) {
			mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
	private static int recursiveBinarySearch(int[] arr, int key, int start, int end) {
		int mid;
		if (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				return recursiveBinarySearch(arr, key,start, mid - 1);
			else
				return recursiveBinarySearch(arr, key, mid+1, end);
		}
		return -1;
	}
}
