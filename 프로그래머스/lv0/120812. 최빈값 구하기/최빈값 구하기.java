import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
     int answer = 0;
		int max = 0;
		
		Arrays.sort(array); //주어진 배열을 오름차순으로 정렬 
		max = array[array.length-1]; //배열의 최대값을 max로 설정 
		
		int count[] = new int[max+1]; // array배열의 각 값들을 count하기 위한 배열 생성    
		
		for(int i = 0; i < array.length; i++) {
			count[array[i]]++; //array배열의 각 값들에 count 
		}
		
		max = count[0];
		
		for(int i = 1; i < count.length; i++) {
			if(max < count[i]) { //최빈값 구하기  
				max = count[i];
				answer = i;
			}
			else if (max == count[i]) { //최빈값이 여러개일 경우 
				answer = -1;
			}
		}
		
		
		
		return answer;
    }
}