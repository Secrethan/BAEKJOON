class Solution {
	public boolean solution(int x) {
		//추후 조건문에 사용하기 위해 num 선언    
        int num = x;
		int sum = 0;
		// 모든 자리수의 합 구하기
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return num % sum == 0 ? true : false;
	}
}