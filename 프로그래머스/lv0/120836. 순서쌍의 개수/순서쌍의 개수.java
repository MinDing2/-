class Solution {
    public int solution(int n) {
        /*
         *(a,b)
         * n 매개변수
         *두 숫자의 곱이 n인 자연수 순서쌍의 개수
         *리턴 
         *
         */
        int answer = 0; 
     
            for(int i = 1; i <= n; i++){
                    if(n % i == 0){
                        answer += 1;
                    }
            }
        
        
        
        return answer;
    }
}