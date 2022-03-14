import java.util.*;

public class HomeTask6Four {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int sizeOfArrayOne = scan.nextInt();
		int[] nums = new int[sizeOfArrayOne];
		for (int i = 0; i < sizeOfArrayOne; i++) {
			nums[i] = scan.nextInt();
		}
		int len = nums.length;
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = len - 1; i + count < len && j > -1; j--) {
				if (nums[i + count] == nums[j]) {
					count++;
				} else {
					if (count > 0) {
						max = Math.max(count, max);
						count = 0;
					}
				}
			}
			max = Math.max(count, max);
		}
		System.out.println(max);
		scan.close();

	}

}
