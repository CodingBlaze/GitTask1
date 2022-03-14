import java.util.*;

public class Hometask3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int numberOfRows = scan.nextInt();
		System.out.println("Enter the increment value");
		int incrementValue = scan.nextInt();
		int startingValue = 0;
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < row + 1; column++) {
				System.out.print(startingValue + " ");
				startingValue += incrementValue;
			}
			System.out.println();
		}
		scan.close();
	}

}
