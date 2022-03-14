import java.util.*;

public class Hometask5Nine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String baseString = scan.nextLine();
		int sum = 0;
		String k = "";
		for (int i = 0; i < baseString.length(); i++) {
			if (Character.isDigit(baseString.charAt(i))) {
				k += baseString.substring(i, i + 1);
			} else {
				if (k.length() > 0) {
					sum += Integer.parseInt(k);
					k = "";
				}

			}
		}
		if (k.length() > 0) {
			sum += Integer.parseInt(k);
		}
		System.out.println(sum);
		scan.close();
	}

}
