class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac = 1; 
         
        while(answer <= n){
             fac++;
             answer *= fac;
        }
        
         answer = fac - 1;
         return answer;
    }
}