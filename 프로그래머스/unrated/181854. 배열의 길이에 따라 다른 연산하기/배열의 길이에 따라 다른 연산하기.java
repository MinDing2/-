class Solution {
    public int[] solution(int[] arr, int n) {
        
        if(arr.length % 2 == 1) {//arr길이가 홀수라면
			
			//짝수 인덱스에 n더함
			for (int i = 0; i < arr.length; i++) {
				if(i % 2 == 0) // 짝수 인덱스
				{
					arr[i] += n; // n 더함
				}
			}
			
		}else {//짝수라면
			//홀수 인덱스 더함
			for (int i = 0; i < arr.length; i++) {
				if(i % 2 == 1) // 홀수 인덱스
				{
					arr[i] += n; // n 더함
				}
			}
		}
		
		//출력
		
			
        return arr;
    }
}