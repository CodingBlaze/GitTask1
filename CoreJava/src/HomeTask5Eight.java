import java.util.*;

public class HomeTask5Eight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String baseString = scan.nextLine();
		int update = 0;
		int temp = 0;
		for (int i = 0; i < baseString.length() - 1; i++) {
			if (baseString.charAt(i) == baseString.charAt(i + 1)) {
				temp = temp + 1;
			} else {
				temp = 0;
			}
			update = Math.max(update, temp);
		}
		if (baseString.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(update + 1);
		}
		scan.close();
	}

}
