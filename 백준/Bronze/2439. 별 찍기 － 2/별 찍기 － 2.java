import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		int star = input.nextInt();
		input.close();
		
		for(int i = 1; i <= star; i++) {
			for(int j = star; j >0; j--) {
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}

	}
}
