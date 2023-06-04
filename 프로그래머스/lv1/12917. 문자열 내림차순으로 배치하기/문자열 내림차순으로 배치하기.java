import java.util.Arrays;
class Solution {
	  public String solution(String s) {
	        String answer = "";
	        char sortArr[] = new char[s.length()];
	       
	        //String -> char[] 변환
	        for(int i = 0; i < s.length(); i++) {
	        	sortArr[i] = s.charAt(i);	
	        }
	        // 정렬
	        Arrays.sort(sortArr);
	        //역순 
	        StringBuilder sb = new StringBuilder(String.valueOf(sortArr));
	        sb.reverse();
	        
	        answer = sb.toString();
	        
	        return answer;
	    }

	public static void main(String[] args) {
		Solution sol = new Solution();
			String s = "Zbcdefg";
		
		sol.solution(s);
	}
}