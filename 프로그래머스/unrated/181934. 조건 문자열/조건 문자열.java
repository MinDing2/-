class Solution {
    public int solution(String ineq, String eq, int n, int m) {
       
		int answer;
        
		//4가지 경우 
		if(ineq.equals(">") && eq.equals("=")) {
			answer = (n >= m) ? 1 : 0; 
		}else if(ineq.equals(">") && eq.equals("!")) {
			answer = (n > m) ? 1 : 0; 
		}else if(ineq.equals("<") && eq.equals("=")) {
			answer = (n <= m) ? 1 : 0; 
		}
		else {
			answer = (n < m) ? 1 : 0; 
		}
			
		return answer;
    }
}