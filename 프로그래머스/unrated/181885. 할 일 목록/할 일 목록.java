class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
		String ans = "";
		int cnt = 0;
        
		for (int i = 0; i < finished.length; i++) {	
			if(!finished[i]) {
				ans += todo_list[i];
				ans += " ";
				cnt++;
			}
		}
		answer = new String[cnt];
        ans = ans.trim();
		answer = ans.split(" ", cnt);

	    return answer;
	
    }
}