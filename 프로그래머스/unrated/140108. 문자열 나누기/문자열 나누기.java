import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int x_num = 0, other_num = 0;
        int count = 0;
        for (char x : str.toCharArray()) {
            char index = str.charAt(0);
            if (x == index) x_num++;
            else other_num++;
            count++;
            
            if (x_num == other_num && x_num != 0) {
                answer++;
                str = str.substring(count);
                count = 0;
                x_num = 0;
                other_num = 0;
            }
            else if (str.length() == 1 || count == str.length()-1 ) {
                answer++;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        System.out.println(sol.solution(str));
    }
}