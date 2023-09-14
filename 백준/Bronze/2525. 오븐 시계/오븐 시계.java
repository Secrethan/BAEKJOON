import java.util.Scanner;

public  class Main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				
			int a = input.nextInt(); //시
			int b = input.nextInt(); //분
			int c = input.nextInt(); //소요
			
			int min = (a*60)+b;
			min += c;
		
			
			int hour = (min / 60) % 24;
			int minute = min % 60;
			
		
			System.out.println(hour+" "+minute);
			input.close();
		}
}
 