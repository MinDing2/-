class Solution {
    public int solution(String message) {
        /*
         *글자 한자를 가로 2cm 
         *편지를 가로로만 적을 때 축하 문구message를
         *적기위해 필요한 편지지의 최소 가로길이를 return 하도록
         *
         */
        int answer = 0;
        
        answer = message.length() * 2;
        
        return answer;
    }
}