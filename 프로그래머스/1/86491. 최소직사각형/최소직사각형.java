import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int size[] = sizes[i];
            int tempMax = Math.max(size[0], size[1]);
            int tempMin = Math.min(size[0], size[1]);
            
            max = Math.max(max, tempMax);
            min = Math.max(min, tempMin);
        }
        return max * min;  
    }
}