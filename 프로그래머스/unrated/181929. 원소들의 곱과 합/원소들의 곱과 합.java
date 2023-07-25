class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
		int mfSum= 1;
		for(int i = 0; i < num_list.length; i++) {
			sum += num_list[i];
			mfSum *= num_list[i];
		}
		if(mfSum > Math.pow(sum, 2)) {//mfSum이 크면 0을
			return 0;
		}else {//작으면 1
			return 1;
		}		
    }
}