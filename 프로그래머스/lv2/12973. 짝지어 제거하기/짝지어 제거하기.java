import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.EmptyStackException;
import java.util.Stack;


class Solution {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
       
            for (char x : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == x) stack.pop();
                else stack.push(x);
            }
        answer = stack.isEmpty() ? 1 : 0;
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