class Solution {
    public int solution(String my_string) {
        String sr = "";
		int answer = 0;
		int cnt = 0; 
		
		for (int i = 0; i < my_string.length(); i++) {
			if(cnt != 0 && my_string.charAt(i) < 65) {
				sr += " ";
				sr += my_string.charAt(i);
				cnt = 0; 
			}else if(my_string.charAt(i) < 65 ) {
				sr += my_string.charAt(i); 
				cnt = 0;
			}else{
				cnt++;
			}
		}
		
		String[] str = sr.split(" "); 
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("")) {
				str[i] = "0";
			}
			if(1 <= Integer.parseInt(str[i]) && Integer.parseInt(str[i]) < 1000 ) {
				answer += Integer.parseInt(str[i]);
			}
		}
        return answer;
    }
}