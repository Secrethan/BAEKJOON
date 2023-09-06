
class Solution {
    public int solution(int n) {
        int answer = 0;

        int cnt = Integer.bitCount(n);
        int n_cnt = 0;

        while (true) {
            n++;
            n_cnt = Integer.bitCount(n);
            if (cnt == n_cnt) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}