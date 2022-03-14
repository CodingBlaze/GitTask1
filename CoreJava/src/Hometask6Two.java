import java.util.Scanner;

public class Hometask6Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int result = 0;
		int tempVariable = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1] && tempVariable == 0) {
				result += 1;
				tempVariable = 1;
			} else if (array[i] == array[i + 1] && tempVariable == 1) {
				tempVariable = 1;
			} else {
				tempVariable = 0;
			}
		}
		System.out.println(result);
		scan.close();
	}

}
