import java.util.*;

public class Hometask5Seven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base string");
		String baseString = scan.nextLine();
		System.out.println("Enter the string to be removed");
		String removeString = scan.nextLine();
		int i = 0;
		while (i < baseString.length() - removeString.length() + 1) {
			if (baseString.substring(i, i + removeString.length()).equalsIgnoreCase(removeString)) {
				baseString = baseString.substring(0, i)
						+ baseString.substring(i + removeString.length(), baseString.length());
			} else {
				i += 1;
			}
		}

		System.out.println(baseString);
		scan.close();
	}

}
