class Solution {
   public int[] solution(long n) {
		// 입력받은 정수 n을 문자열로 변경
		String array = String.valueOf(n);

		// 변경 가능한 문자열인 StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder(array);

		// StringBuilder의 reverse 메소드를 통해 문자열 뒤집기
		sb = sb.reverse();

		// string.split("")을 통해 한 글자씩 분리하여 배열에 저장
		String strArr[] = sb.toString().split("");
		int answer[] = new int[sb.length()];

		for (int i = 0; i < sb.length(); i++) {
			// string -> int[]
			answer[i] = Integer.parseInt(strArr[i]);
		}
		return answer;
	}
}