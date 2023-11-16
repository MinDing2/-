class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                cnt = 0;
                answer += " ";
            }else if(cnt % 2 == 0 && s.charAt(i) > 96){
                answer += (char)(s.charAt(i) - 32);
                cnt++; 
            }else if(cnt % 2 == 1 && s.charAt(i) < 96){
                answer += (char)(s.charAt(i) + 32);
                cnt++; 
            }else{
                answer += s.charAt(i);
                cnt++;
            }
        
        }
        
        return answer;
    }
}