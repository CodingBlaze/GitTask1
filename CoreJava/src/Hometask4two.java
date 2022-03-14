
public class Hometask4two {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			} else if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("The minimum value in the array is " + Integer.toString(min)
				+ " , the maximum value in the array is " + Integer.toString(max));

	}

}
