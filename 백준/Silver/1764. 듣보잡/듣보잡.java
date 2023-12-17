import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n + m; i++) {
            list.add(br.readLine());
        }
        br.close();

        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        long cnt = map.values().stream().filter(c -> c > 1).count();

        System.out.println(cnt);

        map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                    System.out.println(e.getKey());
                });
    }
}
