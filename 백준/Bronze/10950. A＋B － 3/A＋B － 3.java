import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int t = input.nextInt(); // 테스트케이스 갯수

		for (int i = 1; i <= t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			sum = a + b;
			System.out.println(sum);
		}

		input.close();
	}
}