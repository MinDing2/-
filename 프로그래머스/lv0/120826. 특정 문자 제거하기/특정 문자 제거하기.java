class Solution {
    public String solution(String my_string, String letter) {
        //my_string,letter
        //my_string,letter를 제거한 문자열을 
        //return     
        
        String answer = "";
        
        answer = my_string.replaceAll(letter, "");
        
        return answer;
    }
}