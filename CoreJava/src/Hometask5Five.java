import java.util.*;

public class Hometask5Five {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter another number");
		int b = scan.nextInt();
		int firstOne = a / 10;
		int firstTwo = a % 10;
		int SecondOne = b / 10;
		int SecondTwo = b % 10;
		if (firstOne == SecondOne || firstOne == SecondTwo) {
			System.out.println(true);
		} else if (firstTwo == SecondOne || firstTwo == SecondTwo) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scan.close();
	}

}
