
class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        //p, t, (p-t)의 길이
        int p_length = p.length(); //3
        int t_length = t.length(); // 7
        int length = t_length - p_length; // 4
        
        //부분 문자열을 대입할 배열 선언 
        String arr[] = new String[length+1];
   
        //문자열 t를 p의 길이만큼 (t_length - p_length+1)개로 자르기 
        for (int i = 0; i <= length; i++) {
        	arr[i]= t.substring(i, p_length);
        	p_length++;
        	//부분 문자열 비교 
        	if(Long.parseLong(arr[i]) <= Long.parseLong(p)) {
        		answer++;
        	}
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		sol.solution("3141592", "271");
		
	}
}