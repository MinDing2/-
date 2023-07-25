class Solution {
    public int solution(int n, String control) {
        int answer = n;
       for(int i = 0; i < control.length(); i++) {
			if('a' == control.charAt(i)) {
				answer -= 10;
			}
			else if('w' == control.charAt(i)) {
				answer += 1;
			}else if('s' == control.charAt(i)) {
				answer -= 1;
			}else {
				answer += 10;
			}
		}

        return answer;
    }
}