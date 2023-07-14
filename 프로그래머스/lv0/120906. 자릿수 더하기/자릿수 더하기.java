class Solution {
    public int solution(int n) {
        //n의 각 자리 숫자의
        //합을 리턴
        int answer = 0;
        
        for(int i = 0; i < 6; i++){
          answer += n % 10;
          n /= 10;
        }
        
        return answer;
    }
}