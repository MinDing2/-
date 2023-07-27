class Solution {
    public String solution(String[] my_strings, int[][] parts) {
		String answer = "";
        int cnt=0;
		
		for (int i = 0; i < my_strings.length; i++) {
			answer += my_strings[i].substring(parts[i][cnt], parts[i][cnt + 1] + 1);
			cnt = 0; 
		}
		
		return answer;
    }
}