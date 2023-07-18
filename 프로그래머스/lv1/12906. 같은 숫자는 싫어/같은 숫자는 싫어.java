import java.util.Stack;


class Solution {
	public int[] solution(int []arr) {
		 int answer[];
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 for(int i : arr) {
			 if(stack.size() == 0) stack.push(i);
			 else if (stack.peek() != i) stack.push(i);
		 }
		 
		 answer = new int[stack.size()];
		 
		 for(int i = stack.size()-1; i >= 0 ; i--) {
			 answer[i] = stack.pop();
		 }
	    
	      
	        return answer;
	
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {1,1,3,3,0,1,1};
		sol.solution(arr);
		

	}
}