import java.util.StringTokenizer;
class Solution {
	public String solution(String s) {
		// 공백도 하나의 토큰으로 나눔
		StringTokenizer st = new StringTokenizer(s, " ", true);
		StringBuilder sb = new StringBuilder();

		// 토큰이 없을때 까지 반복
		while (st.hasMoreTokens()) {
			String ss = st.nextToken();

			// 토큰이 공백이면 sb에 저장
			if (ss.equals(" ")) {
				sb.append(ss);
			}
			// 토큰이 공백이 아니라면 토큰의 첫 번째 문자만 대문자 처리 후 저장
			else {
				sb.append(ss.substring(0, 1).toUpperCase() + ss.substring(1, ss.length()).toLowerCase());
			}
		}
		System.out.print(sb.toString());

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution su = new Solution();
		su.solution("3people unFollowed me");
	}
}