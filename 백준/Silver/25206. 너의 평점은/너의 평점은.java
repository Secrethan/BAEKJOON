import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sumNum = 0;
        double sumNumxScore = 0;

        for(int i = 0; i <= 19; i++) {
           st = new StringTokenizer(br.readLine());
           //과목명
           String object = st.nextToken();
           //학점
           double credit = Double.parseDouble(st.nextToken());
           //등급
           String grade = st.nextToken();
           double score = 0;

           if(!(grade.equals("P"))) {
               switch (grade) {
                   case "A+" : score = 4.5; break;
                   case "A0" : score = 4.0; break;
                   case "B+" : score = 3.5; break;
                   case "B0" : score = 3.0; break;
                   case "C+" : score = 2.5; break;
                   case "C0" : score = 2.0; break;
                   case "D+" : score = 1.5; break;
                   case "D0" : score = 1.0; break;
                   case "F" : score = 0.0; break;
                   default: break;
               }
               sumNumxScore += (credit * score);
               sumNum += credit;
           }
        }
        br.close();
        System.out.printf("%.6f", sumNumxScore/sumNum);
    }
}
