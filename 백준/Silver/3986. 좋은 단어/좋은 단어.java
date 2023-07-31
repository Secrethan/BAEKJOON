import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String str[] = new String[number];
        
        for(int i = 0; i < number; i++) {
            str[i] = br.readLine();     
        }
        
        Stack<Character> stack = new Stack<Character>();
        int goodWords = 0;
        
        

        for(int i=0; i<number; i++) {
            for(int j=0; j< str[i].length(); j++) {
                if(!stack.isEmpty() && str[i].charAt(j) == stack.peek())
                    stack.pop();	
                else
                    stack.push(str[i].charAt(j));	
            }
       
            if(stack.size() == 0)
                goodWords ++;

            stack.clear();
        }

        System.out.println(goodWords);
        scan.close();

    }
}
