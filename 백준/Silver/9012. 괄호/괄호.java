import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력 받을 괄호 문자열 수
        int input = Integer.parseInt(br.readLine());

        String str[] = new String[input];
        //괄호 문자열 입력
        for(int i = 0; i < input; i++) {
            str[i] = br.readLine();
        }

        Stack<Character> stack = new Stack<>();

       for(int i = 0 ; i < input; i++) {
           for(char c : str[i].toCharArray()) {
               if(c == '(') stack.push(c);
               else {
                    if(stack.size() != 0 && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
               }
           }
           if(stack.size() != 0) {
               System.out.println("NO");
               stack.clear();
           }else {
               System.out.println("YES");
           }

       }

    }
}
