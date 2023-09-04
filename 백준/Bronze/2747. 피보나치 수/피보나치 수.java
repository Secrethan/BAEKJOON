import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
       // n 은 45 이하의 자연수 
       int dp[] = new int[46];
       dp[1] = 1;
       
       for(int i = 2; i <= n; i++) {
           dp[i] = dp[i-1] + dp[i-2];
       }
        System.out.println(dp[n]);
    }
}

