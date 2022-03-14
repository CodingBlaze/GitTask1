import java.util.*;
public class Hometask5Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of tea");
		int tea = scan.nextInt();
		System.out.println("Enter the amount of candy");
		int candy = scan.nextInt();
		int outcome = 0;
		if (tea < 5 || candy < 5) {
			outcome = 0;
		} else if (tea >= 5 && candy >= 5) {
			if (tea >= candy * 2 || candy >= tea * 2) {
				outcome = 2;
			} else {
				outcome = 1;
			}
		}
		System.out.println(outcome);
		scan.close();
	}

}