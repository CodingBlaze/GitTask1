import java.util.*;

public class Hometask3dowhileloop {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int numberOfRows = scan.nextInt();
		System.out.println("Enter the increment value");
		int incrementValue = scan.nextInt();
		int startingValue = 0;
		int row = 0;
		int column = 0;
		do {
			do {
				System.out.print(startingValue + " ");
				column += 1;
				startingValue += incrementValue;
			} while (column <= row);
			System.out.println();
			column = 0;
			row += 1;

		} while (row < numberOfRows);
		scan.close();
	}

}
