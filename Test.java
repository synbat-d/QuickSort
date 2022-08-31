public class Test {
    public static void main(String[] args) {
        int [] arr = {25, 31, 42, 50, 53, 64, 105, 203, 306};
        QuickSort.sort(arr, 0, 8);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }
}
