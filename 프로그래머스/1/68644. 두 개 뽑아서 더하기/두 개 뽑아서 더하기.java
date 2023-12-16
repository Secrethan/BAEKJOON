import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[j] + numbers[i]);
            }
        }
        return set.stream().sorted()
                .mapToInt(n -> n).toArray();
    }
}
