class Solution {
    public String solution(String my_string) {
        String answer = "";
        //a,e,i,o,u
        //my_string 문자열
        //모음을 제거한 문자열을 return 
        //a e i o u 를 공백으로 대체 
        //replace 함수사용 
    
        String match = "[a,e,i,o,u]";
        
        answer = my_string.replaceAll(match,"");
      
        //공백 유지가 관건 
        
        
        
        return answer;
    }
}