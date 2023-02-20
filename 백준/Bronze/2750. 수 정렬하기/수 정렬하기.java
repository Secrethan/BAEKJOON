import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int answer[] = new int[n];

		for (int i = 0; i < n; i++) {
			answer[i] = input.nextInt();
		}
		Arrays.sort(answer);

		for (int i = 0; i < n; i++) {
			System.out.println(answer[i]);
		}

	}
}