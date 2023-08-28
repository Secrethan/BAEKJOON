import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int solution(int n, int k) {
        int answer =0;
        int arr[] = new int[n+1];
        for(int i = 2; i<= n; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= n; i++) {
           if(arr[i] == 0) continue;

           for(int j = i; j <=n; j= j+i) {
               if(arr[j] != 0) {
                   arr[j] = 0;
                   k--;
                   if(k == 0) {
                       answer = j;
                   }
               }
           }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(m.solution(n, k));

        }

}
