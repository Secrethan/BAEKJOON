

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       // StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        br.close();
        List<Character> list = new ArrayList<>();
        for(char x : str.toCharArray()) {
            list.add(x);
        }

        IntStream.range(0, (list.size()+9) / 10)
                .mapToObj(i -> list.subList(i * 10, Math.min((i+1)*10, list.size())))
                .forEach(sl -> {
                    sl.forEach(System.out::print);
                    System.out.println();
                });
    }
}
