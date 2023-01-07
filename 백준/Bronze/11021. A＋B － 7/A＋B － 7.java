import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		int sum[] = new int[tc];
		
		for(int i = 0; i < tc; i++) {
			int a = input.nextInt();
			int b= input.nextInt();
			sum[i] = a+b;
		}
		for(int i = 0; i <tc; i++) {
			System.out.println("Case #"+ (i+1) + ": " + sum[i]);
		}
		
		input.close();
	}
}