import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int solution(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
                queue.offer(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            int temp = queue.poll();
            queue.offer(temp);
        }

      return queue.poll();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(m.solution(n));
    }
}
