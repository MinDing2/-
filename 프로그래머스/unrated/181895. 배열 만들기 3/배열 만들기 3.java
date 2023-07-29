import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> num = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
	
		System.out.println();
		for (int i = 0; i < intervals.length; i++) {
			for (int j = 0; j < intervals.length; j++) {
				num.add(intervals[i][j]);

			}
		}
	
		for (int i = num.get(0); i <= num.get(1); i++) {
			answer.add(arr[i]);
		}
		for (int i = num.get(2); i <= num.get(3); i++) {
			answer.add(arr[i]);
		}
        
        
        return answer;
    }
}