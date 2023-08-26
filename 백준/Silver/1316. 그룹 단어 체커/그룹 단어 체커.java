import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int solution(String arr[]) {
        int answer = arr.length;
        boolean index[] = new boolean[26];

        for(String x : arr) {
            Arrays.fill(index,false);
            for(int i = 0; i < x.length()-1; i++) {
                if(x.charAt(i) != x.charAt(i+1)) {
                    if(index[x.charAt(i+1)-97] == true) {
                        answer--;
                        break;
                    }
                }
                index[x.charAt(i)-97] = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();
        System.out.println(m.solution(arr));
    }
}
