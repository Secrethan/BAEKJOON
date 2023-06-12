
class Solution {
	
	public int solution(int x, int y, int n) {
       int answer[] = new int[y + 1];
       
        for (int i = x + 1; i <= y; i++) {
            int a = i - n >= x ? answer[i - n] : Integer.MAX_VALUE;
            int b = i / 2 >= x && i % 2 == 0 ? answer[i / 2] : Integer.MAX_VALUE;
            int c = i / 3 >= x && i % 3 == 0 ? answer[i / 3] : Integer.MAX_VALUE;

            int d = Math.min(a, b);
            d = Math.min(d, c);

           answer[i] = (d < Integer.MAX_VALUE) ? d + 1 : Integer.MAX_VALUE;
        }
        return answer[y] < Integer.MAX_VALUE ? answer[y] : -1;
    }
	
	

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		sol.solution(10, 40, 5);
		
	}
}