class Solution {
    public int solution(int n) {
        int cnt = 1;
        int answer = 0;
        
        while(true){
            if(n % cnt == 1){
                answer = cnt;
                break;
            }
            cnt++;
        }
        return answer;
    }
}