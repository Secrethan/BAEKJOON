import java.util.Arrays;
class Solution {
	    public int solution(int a[], int b[]) {
         int answer = 0;
        // ASC
        Arrays.sort(a);
        Arrays.sort(b);
        // DESC 효율성 테스트에서 계속 시간 초과 뜸ㅠㅠ
        
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[a.length-1-i];
        }
        

        return answer;
    }
}