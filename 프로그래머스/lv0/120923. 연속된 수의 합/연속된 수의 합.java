class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = total / num;
		int b = (total%num == 0 ? (a-  num/2) : (a-(num/2-1)));
        for(int i = 0; i< num;i++) {
			answer[i] = b+i;
		}
        return answer;
    }
}