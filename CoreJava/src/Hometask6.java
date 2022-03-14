import java.util.*;

public class Hometask6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		int span = 0;
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					tmp = j - i + 1;
					span = Math.max(tmp, span);
				}
			}
		}
		System.out.println(span);
		scan.close();
	}

}
