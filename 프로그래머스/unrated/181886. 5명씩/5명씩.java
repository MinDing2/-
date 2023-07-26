class Solution {
    public String[] solution(String[] names) {
        
        double num = names.length / (double)5  + 0.8;
		String[] answer =new String[(int)num]; 
		 
		int cnt = 0;
        
		for (int i = 0; i < names.length; i++) {
			if(i % 5 == 0) {
				answer[cnt] = names[i]; 
				cnt++;
				
			}
		}
		return answer; 
    }
}