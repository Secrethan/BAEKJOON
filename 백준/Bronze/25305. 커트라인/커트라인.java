import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
// stream lamda 연습해보자
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        List<Integer> collect = list.stream().sorted((o1, o2) -> {
            return o2- o1;
        }).collect(Collectors.toList());
        System.out.println(collect.get(k-1));
    }
}
