import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(str.equals("0")) break;

            String tmp = sb.append(str).reverse().toString();
            if(str.equals(tmp)) System.out.println("yes");
            else System.out.println("no");
            sb.setLength(0);
        }
        br.close();
    }
}

