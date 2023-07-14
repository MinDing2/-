class Solution {
    public int solution(int n) {
        /*
         *몫을 구하고 
         *0이면 +1 
         *나머지가 존재하면 +1 
         * 
         */
        
        int answer = 0;
        
        answer = n / 7;
        
           if(n % 7 > 0)
               answer += 1; 
                
        
        return answer;
    }
}