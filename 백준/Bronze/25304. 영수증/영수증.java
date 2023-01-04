import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
	
		int total = input.nextInt(); //총 금액
		
		int category = input.nextInt(); //구매한 물건의 수 	
		
		for(int i = 0; i < category; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			list.add(a*b);
			sum += list.get(i);

		}
		if(total == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		input.close();
	}
}
