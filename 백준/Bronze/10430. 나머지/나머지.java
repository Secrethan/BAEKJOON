
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int num1 = (a+b) % c;
		int num2 = ((a%c) + (b%c)) % c;
		int num3 = (a*b) % c;
		int num4 = ((a%c) * (b%c)) % c;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		input.close();
	}
}

