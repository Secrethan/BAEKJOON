class Solution {
	public String solution(String phone_number) {
		String pnumArr[] = phone_number.split("");
		String answer = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
			pnumArr[i] = "*";
		}
		answer = String.join("", pnumArr);
		return answer;
	}
}