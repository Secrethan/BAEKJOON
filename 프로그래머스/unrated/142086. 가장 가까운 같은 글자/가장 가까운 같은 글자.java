import java.util.HashMap;
import java.util.Map;
class Solution {
	
	  public int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        String[] strArr = s.split("");
	        
	        Map<String, Integer> strMap = new HashMap<String, Integer>();
	        
	        for(int i = 0; i < strArr.length; i++) {
	        	if(strMap.get(strArr[i]) == null) {
	        		answer[i] = -1;
	        	}
	        	else {
	        		answer[i] = i - strMap.get(strArr[i]);
	        	}
	        	strMap.put(strArr[i], i);
	        }
	        
	        return answer;
	    }
	

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		sol.solution("banana");
		
	}
}