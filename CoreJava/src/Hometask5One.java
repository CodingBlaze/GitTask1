import java.util.*;

public class Hometask5One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int numberOne = scan.nextInt();
		System.out.println("Enter another number");
		int numberTwo = scan.nextInt();
		if (numberOne == 6 || numberTwo == 6 || numberOne + numberTwo == 6 || Math.abs(numberOne - numberTwo) == 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scan.close();
	}

}
