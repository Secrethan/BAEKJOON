import java.util.Arrays;
class Solution {
    public long solution(long n) {
    	String reverse = "";
      
        // 정수 -> 문자열 - > 문자열배열
        String arr[] =  String.valueOf(n).split("");
        //오름차순 정렬 
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i >= 0; i--) {
        	reverse += arr[i];
        }
       
        return Long.parseLong(reverse);
    }
}