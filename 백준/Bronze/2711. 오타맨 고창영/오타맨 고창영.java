import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            String tmp = str.replaceAll("[^a-zA-Z]","");
            int num = Integer.parseInt(str.replaceAll("[^0-9]",""));

            sb.append(tmp).deleteCharAt(num-1);

            System.out.println(sb);
            
            sb.setLength(0);
        }
        br.close();
    }
}

