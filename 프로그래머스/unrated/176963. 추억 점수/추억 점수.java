import java.util.HashMap;
import java.util.Map;

class Solution {
	//name : 그리운 사람의 이름 배열
	//yearning : 각 사람별 그리움 점수 배열
	//photo : 사진에 찍힌 사람들의 이름 배열 
	 public int[] solution(String[] name, int[] yearning, String[][] photo) {
	        int answer[] = new int[photo.length];
	        
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        //(key,value)쌍으로 name,yearning 저장 
	        for(int i = 0; i < name.length; i++) {
	        	map.put(name[i], yearning[i]);
	        }
	        //photo[][]의 이름과 map의 key를 대조, 일치 시 해당 value 값을 저장 
	        for(int i = 0; i< photo.length; i++) {
	        	int sum = 0;
	        	for(int j = 0; j < photo[i].length; j++) {
	        		sum += (map.containsKey(photo[i][j])) ? map.get(photo[i][j]) : 0;
	        	}
	        	answer[i] = sum;
	        }

	        return answer;
	    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String name[] = {"may", "kein", "kain"};
		int yearning[] = {5, 10, 1};
		String photo[][] = {{"may", "kein", "july"},{"may", "kein", "kain", "bob"}, {"kein", "bob", "july"}};

		sol.solution(name, yearning, photo);
	}
}