import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int maxValue = 0;
        char maxChar = 0;

        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }
        for(int i=0; i<26; i++){
            int compare = arr[i]- maxValue;
            if(compare > 0){
                maxValue = arr[i];
                maxChar = (char)('A'+i);
            } else if(compare == 0 ) maxChar ='?';
        }
        System.out.println(maxChar);
    }
}