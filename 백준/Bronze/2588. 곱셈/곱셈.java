import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		// 543 % 10 = 3
		// 543 % 100 = 43 -3 = 40
		int c = b % 10;
		int d = ((b % 100) - c) / 10;
		int e =  (b - (b % 100)) / 100;
		int num1 = a * c;
		int num2 = a * d;
		int num3 = a * e;
		int num4 = a * b;
		System.out.println(num1);
		System.out.println(num2);		
		System.out.println(num3);
		System.out.println(num4);
		input.close();
	}
}
