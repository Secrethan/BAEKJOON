class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int[] nums = new int[strings.length];
 
        for(int i=0; i<strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
 
        int min = nums[0];
        int max = nums[0];
 
        for(int i=0; i<nums.length; i++) {
 
            if(min>nums[i]) {
                min = nums[i];
            }
 
            if(max<nums[i]) {
                max = nums[i];
            }
        }
 
        answer = min +" "+ max;
 
        return answer;
    }
}