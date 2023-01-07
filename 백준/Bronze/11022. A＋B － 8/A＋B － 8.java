import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		int a[] = new int[tc];
		int b[] = new int[tc];
		int sum[] = new int[tc];
		
		for(int i = 0; i < tc; i++) {
			 a[i] = input.nextInt();
			 b[i] = input.nextInt();
			sum[i] = a[i]+b[i];
		}
		for(int i = 0; i <tc; i++) {
			System.out.println("Case #"+ (i+1) + ": " +a[i]+" + "+b[i]+" = "+sum[i]);
		}
		
		input.close();
	}
}