import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String mbti ,String test[]) {
        int answer = 0;
        String tmp = mbti;
        for(String x : test) {
         if(x.equals(tmp)) answer ++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String mbti = br.readLine();
       int n = Integer.parseInt(br.readLine());
       String test[] = new String[n];
       for(int i = 0; i < n; i++) {
           test[i] = br.readLine();
       }
        System.out.println(m.solution(mbti,test));
    }
}

