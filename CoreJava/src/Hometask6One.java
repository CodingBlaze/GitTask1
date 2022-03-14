import java.util.*;

public class Hometask6One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		int tempSum = 0;
		boolean verify = true;
		for (int i : array) {
			tempSum += i;
			if (tempSum * 2 == sum) {
				System.out.println(true);
				verify = false;
				break;
			}
		}
		if (verify) {
			System.out.println(false);
		}
		scan.close();
	}

}
