class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		int cnt = 0;

		for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				if (num_list[cnt] % 2 == 0) { // 짝수
					num_list[cnt] /= 2;
					answer++;
				} else {// 홀수
					num_list[cnt] -= 1;
					num_list[cnt] /= 2;
					answer++;
				}
			}
			cnt++;
		}

		return answer;
	}
}
	
	