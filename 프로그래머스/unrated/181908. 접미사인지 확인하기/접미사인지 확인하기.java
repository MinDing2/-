class Solution {
    public int solution(String my_string, String is_suffix) {
        String str = "";
        int answer = 0;
		
	
		for (int i = 0; i < my_string.length(); i++) {
			for (int j =  i; j < my_string.length(); j++) {
                // 0-5 1-5, 2-5, 3-5  4-5 5-5
			 	str += my_string.charAt(j);
			}
			//접미사면(0-5 ~ 5-5) 
			if(str.equals(is_suffix)) {
				answer = 1;
			}
			str =""; //str 초기화
		}
        
        return answer;
    }
}