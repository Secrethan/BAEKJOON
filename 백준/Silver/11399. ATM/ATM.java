import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public int solution(int a[]){
        int personal = 0;
        int accumulate = 0;

       Arrays.sort(a);

       for(int i = 0; i < a.length; i++) {
           personal += a[i];
           accumulate += personal;
       }
       return accumulate;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(m.solution(arr));

    }
}

