class Solution {
    public String solution(String my_string) {
        //my_string 거꾸로 뒤집기
        
        String answer = "";
        answer = new StringBuilder(my_string).reverse().toString();
        
        return answer;
    }
}