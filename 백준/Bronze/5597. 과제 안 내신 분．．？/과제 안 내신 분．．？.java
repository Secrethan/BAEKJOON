import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[31];

        for (int i = 0; i < 28; i++) {
           int index = Integer.parseInt(br.readLine());
           num[index] = 1;
        }
        for(int i = 1; i < num.length; i++) {
            if(num[i] != 1) System.out.println(i);
        }
    }
}

