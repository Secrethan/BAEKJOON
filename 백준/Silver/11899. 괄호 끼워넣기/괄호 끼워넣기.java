
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<Character>();

        // 문자열 s를 문자 하나 하나씩 변환하여 탐색
        for(char c : s.toCharArray()) {
            if(c == '(') stack.add(c);
            // c == ')'일때
            else {
                // stack 에 ( 괄호가 들어가 있을때
                if(stack.size() != 0 && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        System.out.print(stack.size());
    }
}