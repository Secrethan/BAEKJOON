import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String answer ="";
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        br.close();

        for(String x : str) {
            sb.setLength(0);
            int pos;
            while((pos = x.indexOf(" ")) != -1) {
                String tmp = x.substring(0,pos);
                sb.append(new StringBuilder(tmp).reverse().toString()+" ");
                x = x.substring(pos+1);
            }
            sb.append(new StringBuilder(x).reverse().toString());
            System.out.println(sb);
        }
    }
}

