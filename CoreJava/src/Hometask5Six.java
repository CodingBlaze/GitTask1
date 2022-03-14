import java.util.*;

public class Hometask5Six {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter operand one");
		int operand1 = scan.nextInt();
		System.out.println("Enter operand two");
		int operand2 = scan.nextInt();
		String operandOne = Integer.toString(operand1);
		int sum = operand1 + operand2;
		String sumOne = Integer.toString(sum);
		if (sumOne.length() == operandOne.length()) {
			System.out.println(sum);
		} else {
			System.out.println(operand1);
		}
		scan.close();
	}

}
