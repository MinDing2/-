class Solution {
    public String solution(String my_string, String alp) {

        
        char[] answer = new char[my_string.length()];
		
		for (int i = 0; i < my_string.length(); i++) {
			  answer[i] = my_string.charAt(i);
			  //answer[i]를 문자열로 변환 그걸 alp랑 비교
			  if(String.valueOf(answer[i]).equals(alp)){
			   	  answer[i] -= 32;  
			  }
		}
        
        String answer1 = new String(answer);
        
        return answer1;
    }
}