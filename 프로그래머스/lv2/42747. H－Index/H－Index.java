import java.util.Arrays;

class Solution {
	
	 public int solution(int[] citations) {
	        int answer = 0, len = citations.length;
	        Arrays.sort(citations);
	        for (int i = 0; i < len; i++) {
	            int hIndex = len - i;
	            if (citations[i] >= hIndex) {
	                answer = hIndex;
	                break;
	            }
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		int citations[] = {3,0,1,6,5};
		
		sol.solution(citations);
		
	}
}