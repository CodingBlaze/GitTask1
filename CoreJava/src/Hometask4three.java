import java.util.*;

public class Hometask4three {

	public static void main(String[] args) {
		String string = "Hello every one welcome to epam";
		// declaring a linked list to store the characters
		List<Character> noDuplicates = new LinkedList<Character>();
		for (int i = 0; i < string.length(); i++) {
			// check if the character is present or not
			if (noDuplicates.contains(string.charAt(i))) {
				// if already present then printing the
				System.out.print(string.charAt(i));
			}
			// if character is not present then add it to the list
			else {
				noDuplicates.add(string.charAt(i));
			}
		}
	}

}
