import java.util.*;

public class Hometask6Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int sizeOfArrayOne = scan.nextInt();
		int[] arrayOne = new int[sizeOfArrayOne];
		System.out.println("Enter the size of array2");
		int sizeOfArrayTwo = scan.nextInt();
		int[] arrayTwo = new int[sizeOfArrayTwo];
		for (int i = 0; i < sizeOfArrayOne; i++) {
			arrayOne[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOfArrayTwo; j++) {
			arrayTwo[j] = scan.nextInt();
		}
		int i = 0;
		int j = 0;
		int tempVariable = 0;
		while (i < arrayOne.length && j < arrayTwo.length) {
			if (arrayOne[i] == arrayTwo[j]) {
				tempVariable += 1;
				i += 1;
				j += 1;
			} else if (arrayOne[i] < arrayTwo[j]) {
				i += 1;
			} else {
				j += 1;
			}
		}
		if (tempVariable == arrayTwo.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scan.close();
	}
}
