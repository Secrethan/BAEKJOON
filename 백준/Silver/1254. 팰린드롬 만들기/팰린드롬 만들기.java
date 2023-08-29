import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public boolean solution(String str) {
        int start = 0;
        int end = str.length()-1;
        
        while (start <= end) {
            if(str.charAt(start) != str.charAt(end)) 
                return false;
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (m.solution(str.substring(i))) {
                break;
            }
            length++;
        }
        System.out.println(length);
    }
}
