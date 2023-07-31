import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
       
		 int num = 0;
		 List<Integer> value = new ArrayList<>();

		for (int i = 0; i < flag.length; i++) {
			if(flag[i]) {
				num += arr[i] * 2;
			}else {
				num -= arr[i];
			}
		}
		
		int[] answer = new int[num];
		
		for (int i = 0; i < flag.length; i++) {
			if(flag[i]){
				for (int j = 0; j < arr[i] * 2; j++) 
				{
					value.add(arr[i]);
				}
			}else {
				for (int k = 0; k < arr[i]; k++) {
					value.remove(value.size() - 1);
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = value.get(i);
        }
        
        return answer;
    }
}