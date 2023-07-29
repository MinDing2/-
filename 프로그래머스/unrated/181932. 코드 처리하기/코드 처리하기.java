class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i< code.length(); i++){
            if(code.charAt(i) == '1' && mode == 0) {
	                mode = 1;
	        }else if(code.charAt(i) == '1' && mode == 1) {
	            	mode = 0;
	        }
            if( i % 2 == 0 && mode == 0 && code.charAt(i) != '1'){
                answer += code.charAt(i);
            }
            if(i % 2 == 1 && mode == 1 && code.charAt(i) != '1') {
                answer += code.charAt(i);
            }
        }
        
        if(answer == ""){
            answer = "EMPTY";
        }
        return answer;
    }
}