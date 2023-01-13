class Solution {
    public int solution(int n, int k) {
     
        
		int answer = 0;

		int n1 = n * 12000;
		int k1= k * 2000;
		
		for (int i =1; i<=n; i++) {
			if(i % 10 == 0 ) {
				n1 = n1 - 2000;
			}
		}
		answer = n1 + k1;

        
        
        return answer;
    }
}