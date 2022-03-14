import java.util.*;

class Student {
	String studentName;

	Student(String studentName) {
		this.studentName = studentName;
	}
}

public class Customclass {

	public static void main(String[] args) {
		HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
		hashMap.put(101, new Student("Suresh"));
		hashMap.put(102, new Student("Epam"));
		hashMap.put(103, new Student("Hyderabad"));
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()).studentName);
		}
	}

}
