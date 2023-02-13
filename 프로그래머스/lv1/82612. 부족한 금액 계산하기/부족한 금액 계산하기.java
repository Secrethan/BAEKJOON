class Solution {

	public long solution(int price, int money, int count) {
		long answer = 0;

		for (int i = 1; i <= count; i++) {
			answer += price * i;
		}
		System.out.println(answer);
		if (answer > money) {
			answer = answer - money;
			return answer;
		} else {
			return 0;
		}

	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(3, 20, 4);
	}
}
