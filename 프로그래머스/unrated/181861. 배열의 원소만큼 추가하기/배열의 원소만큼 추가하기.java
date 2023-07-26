class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; //원소합  
		}
		//sum 만큼 answer 배열 할당
		int[] answer = new int[sum];
		
		//각 원소 값 만큼 반복
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
		  for(int j = 0; j < arr[i]; j++ ){
			  answer[cnt] = arr[i];
			  cnt++;
		  }
		}
        return answer;
    }
}