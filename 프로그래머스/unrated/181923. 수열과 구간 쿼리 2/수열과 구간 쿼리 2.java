class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      
	    int[] answer = new int[queries.length];
	    int cnt = 0;
	    int cnt2 = 0;

	    
	    for (int i = 0; i < queries.length; i++) {
	        for (int j = queries[i][0]; j <= queries[i][1]; j++) {
	            if (arr[j] > queries[i][2]) {
	                if (cnt2 == 0) {
	                    answer[cnt] = arr[j];
	                    cnt2 = 1;
	                } else if (answer[cnt] > arr[j]) {
	                    answer[cnt] = arr[j];
	                }
	            } else {
	                answer[cnt] = -1;
	            }
	        }
	        cnt2 = 0;
	        cnt++;
	    }
        return answer;
    }
}