import java.util.*;

public class Hometask5Four {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Enter third number");
		int c = scan.nextInt();
		System.out.println("Enter boolean value true/false");
		boolean d = scan.nextBoolean();
		boolean result = true;
		if (b > a && c > b) {
			result = true;
		} else if (d) {
			if (c > b) {
				result = true;
			} else {
				result = false;
			}
		} else {
			result = false;
		}
		System.out.println(result);
		scan.close();
	}

}
