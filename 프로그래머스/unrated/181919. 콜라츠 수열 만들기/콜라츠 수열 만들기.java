import java.util.ArrayList;

class Solution {
    public  ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
		int cnt = 0; 
		
		while (answer.get(cnt) != 1) {

			if (answer.get(cnt) % 2 == 0) // 짝수
			{
				answer.add(answer.get(cnt) / 2);
			} else { // 홀수
				answer.add(answer.get(cnt) * 3 + 1);
			} 
			cnt++;
		}
        return answer;
    }
}