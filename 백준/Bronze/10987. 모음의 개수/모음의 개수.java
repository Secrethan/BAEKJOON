import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String arr= st.nextToken();

        int cnt = 0;


        for(char x : arr.toCharArray()) {
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x =='u') cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

}
}
