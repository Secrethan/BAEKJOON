import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String s = br.readLine();
        br.close();
        int cnt =0;
        for(char x : s.toCharArray()) {
           if(arr[x-'a'] == -1){ arr[x-'a'] = cnt;}
           cnt++;
        }
        for(int y : arr) {
            bw.write(y+" ");
        }
        bw.flush();
        bw.close();
    }
}
