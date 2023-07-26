import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
       	int num = num_list.length - 5;
		int[] answer = new int[num];
		
		Arrays.sort(num_list);
		int cnt = 0; 
        
		for(int i = 5; i < num_list.length; i++) {
			answer[cnt] = num_list[i];
			cnt++; 
		}
		return answer; 
    }
}