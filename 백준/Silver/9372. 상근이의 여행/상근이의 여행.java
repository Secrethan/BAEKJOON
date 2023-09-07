
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int t = Integer.parseInt(st.nextToken());

        for(int i = 0; i < t; i++) {
            int n, m;

            st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            for(int j = 0; j < m ; j++) {
                br.readLine();
            }
            System.out.println(n-1);
        }
    }
}

