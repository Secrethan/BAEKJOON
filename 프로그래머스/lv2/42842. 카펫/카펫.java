class Solution {
	
	public int[] solution(int brown, int yellow) {
        int answer[] = new int[2];
        //전체 타일의 개수 
        int sum = brown + yellow;
        
     
        for(int i =1; i <= sum; i++) {
        	int row = i;
        	int col = sum / row;
        	//카펫의 가로 길이 >= 세로 길이임  
        	if( row > col) {
        		continue;
        	}
        	// 가로와 세로 각 -2를 하면 yellow 
        	if(((row-2) * (col-2)) == yellow) {
        		answer[0] = col;
        		answer[1] = row;
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();

		sol.solution(10,2);
		
	}
}