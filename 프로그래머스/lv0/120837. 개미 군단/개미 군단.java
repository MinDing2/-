class Solution {
    public int solution(int hp) {
        int cnt = 0;
        int rest = 0;
        
        if(hp >= 5){
           cnt += hp / 5;
           hp = hp % 5;
        }
        
        if(hp >= 3){
           cnt += hp / 3; 
           hp = hp % 3;
        }
        
        if(hp >= 1)
        {
            cnt += hp / 1;
        }
            
        int answer = cnt;
        return answer;
    }
}