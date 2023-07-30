import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;  
        ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < included.length; i++) {
			arr.add(a + d * i);
			
			if(included[i]) {
				answer += arr.get(i);
			}
		}
        return answer;
    }
}