import java.util.*;

public class Hometask4four {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String stringOne = scan.nextLine().toLowerCase();
		System.out.println("Enter another string");
		String stringTwo = scan.nextLine().toLowerCase();
		if (stringOne.length() == stringTwo.length()) {
			stringOne += stringOne;
			if (stringOne.indexOf(stringTwo) != -1) {
				System.out.println("Strings are rotations of each other");
			} else {
				System.out.println("Strings are not rotations of eachother");
			}
		} else {
			System.out.println("Strings are not rotations of eachother");
		}
		scan.close();
	}

}
