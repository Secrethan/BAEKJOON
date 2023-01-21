class Solution {
    public int solution(int n) {
        int answer = 0;
		int a = 0;
		for(int i = 1; i <=n && i <= 6; i++) {
			if(n % i == 0 && 6 % i ==0) {
				a = i; //최대 공약수 	
			}
            else if (n==6) {
				answer = 1;
			}
		}
		int b = (n*6)/a; //최소 공배수 
		answer = b / 6;
		
		return answer;
    }
}