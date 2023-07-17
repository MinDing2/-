class Solution {
    public int solution(int n, int t) {
        //어떤 세균은 1시간에 두배만큼 증식한다.
        //처음 세균의 마리수 n과
        //경과한 시간 t가 매개변수
        //t 시간 후 세균의 수를 return 
        
        for(int i = 0; i < t; i++){
            n *= 2; 
        }
        int answer = n;
        
        return answer;
    }
}