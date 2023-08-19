import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;


public class Main {
    public String[] solution(String[] arr){

        // 1. 문자열 중복 제거 (순서 보장이 필요할 경우 LinkedHashSet 사용 )
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
        String answer[] = hashSet.toArray(new String[0]);

        // 2. 문자열 길이 + 사전 순 정렬
        Arrays.sort(answer, new Comparator<String>() {
            // compare() - return 양수 : 두 객체의 위치를 변경함 / 음수 : 두 객체의 위치를 변경하지 않음
            @Override
            public int compare(String o1, String o2) {
                // 문자열의 길이가 같을 경우
                if(o1.length() == o2.length())
                    // compareTo() 사전 순
                    return o1.compareTo(o2);

                else return o1.length() - o2.length();
            }
        });
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];
        for(int i = 0; i< n; i++) {
            arr[i] = br.readLine();
        }
        for(String x : m.solution(arr)) {
            System.out.println(x);
        }

    }
}

