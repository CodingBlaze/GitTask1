public class Calculator {

	public static void main(String[] args) {
		double operandOne = Double.valueOf(args[0]);
		double operandTwo = Double.valueOf(args[1]);
		String operation = args[2];
		if (operation.equals("+")) {
			System.out.println("The addtion of two operands is " + Double.toString(operandOne + operandTwo));
		} else if (operation.equals("-")) {
			System.out.println("The subtraction of two operands is " + Double.toString(operandOne - operandTwo));
		} else if (operation.equals("'*'")) {
			System.out.println("The multiplication of two operands is " + Double.toString(operandOne * operandTwo));
		} else if (operation.equals("%")) {
			System.out.println(
					"The reminder of operand1 is divided by operand2 is " + Double.toString(operandOne % operandTwo));
		} else if (operation.equals("/")) {
			System.out
					.println("operand1 is " + Double.toString(operandOne * 100 / operandTwo) + " percent of operand2");
		} else {
			System.out.println("No such operation");
		}
	}

}
