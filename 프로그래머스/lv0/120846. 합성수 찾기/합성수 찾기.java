class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0; i <= n; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    cnt++;
                }
                if(1 < cnt){
                    answer++; 
                    break;
                }
            }
            cnt = 0;
        }
        return answer;
    }
}