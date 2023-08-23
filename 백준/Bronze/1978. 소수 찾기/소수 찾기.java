import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int arr[]) {
        int answer = 0;

        for(int x : arr) {
            boolean prime = true;
            if(x == 1) continue;
            for(int i = 2; i <= Math.sqrt(x); i++) {
                if( x % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) answer++;
        }
        return  answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] =new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        System.out.println(m.solution(arr));
    }

}
