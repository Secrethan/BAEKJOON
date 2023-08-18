import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Solution {
    public int[] solution(String str) {
        int[] answer = {};
        int cnt =0;
        int zero = 0;
        while(true) {
            for(char x : str.toCharArray()) {
                if(x == '0') {
                    zero++;
                }
            }
            str = str.replace("0","");
            int n = str.length();
            str = Integer.toBinaryString(n);
            cnt++;

            answer = new int[] {cnt,zero};

            if(str.equals("1")) break;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        sol.solution(str);
    }
}