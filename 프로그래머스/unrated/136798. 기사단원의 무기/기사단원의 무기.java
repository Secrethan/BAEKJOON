class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                // 주의.. 약수의 개수가 홀수인 정수들이 있다 16의 약수는 1,2,4,8,16  4*4 = 16
                if(j * j == i) cnt++; 
                else if(i % j == 0) cnt += 2;
            }
            answer += (cnt > limit) ? power : cnt;
        }
        
       
        return answer;
    }
}