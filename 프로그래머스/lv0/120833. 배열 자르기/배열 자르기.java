import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
         int[] answer = new int[numbers.length];
	        //배열복사
	        //Arrays.copyOfRange(오리지널 배열, 시작범위, 끝범위)
	       answer = Arrays.copyOfRange(numbers, num1, num2+1);
	        
	        
	        return answer;
    }
}