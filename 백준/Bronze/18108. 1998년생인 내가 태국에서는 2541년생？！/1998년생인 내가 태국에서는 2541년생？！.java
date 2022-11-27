import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		Scanner input = new Scanner(System.in);
		
		
		int y = input.nextInt();
		if(y>=1000 && y <= 3000) {
		 x = y -543;
		}
		System.out.println(x);
		
		input.close();
	}
}




