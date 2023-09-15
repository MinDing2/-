class Solution {
    public String solution(String s) {
        String answer = "";
        int len = 0;
        if(s.length() % 2 == 1)
        {
            len = s.length() / 2;
            answer  = s.charAt(len) + "";
        }else{
            len = s.length() / 2 - 1;
            answer = s.charAt(len) + "" + s.charAt(len + 1) ; 
        }
        return answer;
    }
}