import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int n1, int n2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = n1; i <= n2; i++) {
            boolean prime = true;
            if( i == 1 ) prime = false;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) list.add(i);
        }

        for (int x : list) {
            sum += x;
            if (x < min) min = x;
        }
        if (list.isEmpty()) {
            answer.add(-1);
        } else {
            answer.add(sum);
            answer.add(min);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        br.close();

        for (int x : m.solution(n1, n2)) {
            System.out.println(x);
        }
    }
}
