import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(int arr){
        StringBuilder sb = new StringBuilder();
        String answer ="";
        int quarter = 25;
        int dim = 10;
        int nick = 5;
        int penny = 1;

        sb.append(arr / quarter+" ");
        arr %= quarter;
        sb.append(arr / dim+" ");
        arr %= dim;
        sb.append(arr / nick+" ");
        arr %= nick;
        sb.append(arr / penny+" ");
        answer = sb.toString();
        
        return  answer;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i =0; i < n; i++) {
            int arr = Integer.parseInt(br.readLine());
            System.out.println(m.solution(arr));
        }
    }
}

