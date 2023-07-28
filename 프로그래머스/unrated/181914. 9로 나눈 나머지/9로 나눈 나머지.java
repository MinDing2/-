class Solution {
    public int solution(String number) {
		
		char[] num = new char[number.length()];
		int answer = 0;
		
		//charAt 문자열 담아서 int형 더함
		for (int i = 0; i < num.length; i++) {
		num[i]	= number.charAt(i);
			answer += num[i] - 48;
            
		}
		return answer % 9;
    }
}