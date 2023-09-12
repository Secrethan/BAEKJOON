import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
			int hour = input.nextInt();
			int minute = input.nextInt();
			if((hour >=0 && hour <= 23) && (minute >=0 && minute <=59)) {
			
			if((hour == 0)) {
				
				if(minute >=45) {
					minute = minute - 45;
				}
				else {
					hour = 23;
					minute = 60 - (45 - minute);
				}
			}
			//hour = 1~ 23 일때
			else {
					
					if(minute >=45) {
						minute = minute - 45;
					}
					else {
						hour = hour -1;
						minute = 60 - (45 - minute);
					}
			}
			
			}
			System.out.println(hour+" "+minute);
			
			input.close();
	
	}
}

