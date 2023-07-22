import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //입력 받을 수의 개수
        int input = Integer.parseInt(br.readLine());
        int peek = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < input; i++) {
            int value = Integer.parseInt(br.readLine());

            if(value > peek) {
                for(int j =peek+1; j <= value; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                peek = value;
            }
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
}

}
