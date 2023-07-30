class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < queries.length; i++) {
				 temp = arr[queries[i][0]];
				 arr[queries[i][0]] = arr[queries[i][1]];
				 arr[queries[i][1]]  = temp;
		}
        
       for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}
        
        return answer;
    }
}