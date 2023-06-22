import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = (a < b) ? a : b;
            int gcd = 0;

            for (int i = 1; i <= max; i++) {
                if (a % i == 0 && b % i == 0)
                    gcd = i;
            }

            int answer = a*b / gcd;

            System.out.print(answer + " " + gcd +"\n");

        }
    }
}