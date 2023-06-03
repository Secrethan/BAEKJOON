class Solution {

	public int solution(int[] number) {
		int answer = 0;
		//정수 배열 중 정수 3개 조합의 경우의 수 구하기 
		for(int i = 0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				for(int k = j+1; k < number.length; k++) {
					if(number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int studentArr[] = {-2, 3, 0, 2, -5};
		sol.solution(studentArr);

	}
}