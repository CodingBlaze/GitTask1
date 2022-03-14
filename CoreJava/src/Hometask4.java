import java.util.Arrays;

public class Hometask4 {

	public static void main(String[] args) {
		int array[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 19, 21, 23, 24, 27, 28, 32, 35, 45, 48, 62,
				69, 77, 79, 100 };
		Arrays.sort(array);
		for (int i = 0; i < 99; i++) {
			boolean presence = binarySearch(array, i + 1);
			if (presence) {
				continue;
			} else {
				System.out.print(i + 1 + " ");
			}
		}
	}

	static boolean binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return true;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
}