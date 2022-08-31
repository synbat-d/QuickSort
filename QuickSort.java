public class QuickSort {
	public static void swap (int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static int partition (int [] arr, int l, int h) {
		int pivot = arr[l];
		int i = l;
		int j = h;
		while (i<j) {
			do {
				i++;
			} while (arr[i]<=pivot);
			
			do {
				j--;
			} while (arr[j]>pivot);
			if (i<j) 
				swap(arr[i],arr[j]);
		}
		swap(arr[l], arr[j]);
		return j;
	}
	
	public static void sort (int [] arr, int l, int h) {
		if (l<h) {
			int j = partition(arr, l, h);
			sort(arr, l, j);
			sort (arr, j+1, h);
		}
	}
}