import java.util.*;
public class Hometask5Three {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Enter third number");
		int c = scan.nextInt();
		int ab=a+b;
		int bc=b+c;
		int ca=c+a;
		int result=0;
		if(ab==10||bc==10||ca==10) {
			result=10;
		}
		else if(ab-10==bc|| ab-10==ca) {
			result=5;
		}
		else {
			result=0;
		}
		System.out.println(result);
		scan.close();
	}

}
