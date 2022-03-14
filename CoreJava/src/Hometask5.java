import java.util.*;

public class Hometask5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result;
		System.out.println("Enter the speed");
		int speed = scan.nextInt();
		System.out.println("Is it's your birthday true/false");
		boolean birthDate = scan.nextBoolean();
		if (birthDate) {
			if (speed <= 65) {
				result = 0;
			} else if (speed >= 66 && speed <= 85) {
				result = 1;
			} else {
				result = 2;
			}
		} else {
			if (speed <= 60) {
				result = 0;
			} else if (speed >= 61 && speed <= 80) {
				result = 1;
			} else {
				result = 2;
			}
		}
		System.out.println(result);
		scan.close();
	}

}
