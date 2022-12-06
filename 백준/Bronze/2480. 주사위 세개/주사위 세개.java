import java.util.Scanner;

public  class Main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int num[] = new int[3]; 
			int max = 0;
			for(int i =0; i < num.length; i++) {
				num[i] = input.nextInt();
				
			}
	
			if(num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
				max = 10000+1000*num[0]; 
			}
			else if ( num[0] == num[1]) {
				max = 1000+100*num[0];
			}
			
			else if (num[1] == num[2]) {
				max = 1000+100*num[2];
			}
			else if ( num[0] == num[2]) {
				max = 1000+100*num[2];
			} else {
				for(int i = 0; i <num.length; i++) {
					if(num[i] > max) {
					max = num[i];
					}
				}
				max = max *100;
				
			}
			System.out.println(max);
			
			
			
			input.close();
		}
}
 