import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        Set<String> set = new HashSet<>();
        for(String x : s1) {
            if(!set.add(x)) answer++;
        }
        for(String y : s2) {
            if(!set.add(y)) {
                answer++;
            }
        }
        return answer;
    }
}