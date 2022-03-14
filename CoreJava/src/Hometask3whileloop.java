import java.util.*;

public class Hometask3whileloop {

	public static void main(String[] args) {
		System.out.println("Enter number of rows");
		Scanner scan = new Scanner(System.in);
		int numberOfRows = scan.nextInt();
		System.out.println("Enter number of rows");
		int incrementValue = scan.nextInt();
		int startingValue = 0;
		int row = 0;
		int column = 0;
		while (row < numberOfRows) {
			column = 0;
			while (column < row + 1) {
				System.out.print(startingValue + " ");
				column += 1;
				startingValue += incrementValue;
			}
			System.out.println();
			row += 1;
		}
		scan.close();
	}

}