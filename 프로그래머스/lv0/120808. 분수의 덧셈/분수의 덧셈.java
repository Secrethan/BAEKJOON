class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
  		int denom = denom1 * denom2;
		int numer = (numer1 * denom2) + (numer2 * denom1);
		int x = 0;
		int y = 0;

		if(denom < numer) {
			x = denom;
		}
		else {
			x = numer;
		}
		
		for(int i = 1; i <= x; i++) {
			if(denom % i == 0 && numer % i == 0) {
				
					y = i;
			
			}
		}
		denom = denom / y;
		numer = numer / y;
		
		int answer[] = {numer,denom};		
		return answer;
    }
}