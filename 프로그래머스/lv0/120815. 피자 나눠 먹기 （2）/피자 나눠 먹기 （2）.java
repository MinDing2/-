class Solution {
    public int solution(int n) {
        int answer = 0;       
        int six = 6;
        int num = 1;
        
        while(true){
            if( (six * num) % n == 0 ){
                answer = num;
                break;
            }
            num++;
        }
        return answer;
    }
}