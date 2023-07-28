class Solution {
    public int solution(String binomial) {
        String[] str = new String[3];
		int answer   = 0;
		str = binomial.split(" ", 3);
		
		if(str[1].equals("+")){
			answer	= Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
		}else if(str[1].equals("-")){
			answer	= Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
		}else{
			answer	= Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
		}
		
        return answer;
    }
}