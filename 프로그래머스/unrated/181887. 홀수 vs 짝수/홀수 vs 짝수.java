class Solution {
    public int solution(int[] num_list) {
        int holSum = 0;
		int jacSum = 0;
		
		//홀수합 holSum 짝수합 jacSum 
		for (int i = 0; i < num_list.length; i++) {
			if((i + 1) % 2 == 1) { //홀수
			  holSum += num_list[i];
			}else { //짝수
			  jacSum += num_list[i];
			}
		}
        
		//큰걸 반환 같으면 아무거나 
		if(holSum > jacSum) {		
			return holSum;
		}
		else if(holSum < jacSum) {
			return jacSum; 			
		}
		else {
			return jacSum;			
		}
    }
}