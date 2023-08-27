import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public Integer[] solution(int arr[]) {
        /*
            중복 제거 방법
            1. Hashset
            2. LinkedHashSet
            3. indexOf
         */
       HashSet<Integer> hashSet = new HashSet<>();
       for(int x : arr) {
           hashSet.add(x);
       }
       Integer intArr[] = hashSet.toArray(new Integer[0]);
       Arrays.sort(intArr);


        return intArr;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : m.solution(arr)) {
            System.out.print(x+" ");
        }
    }
}
