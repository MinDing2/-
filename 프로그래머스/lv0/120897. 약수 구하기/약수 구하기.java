class Solution {
    public int[] solution(int n) {
        
        int cnt = 1; 
        int cnt1 = 0;
        while(cnt != n + 1){
            if(n % cnt == 0){
                cnt1++; 
            }     
            cnt++;
        }
        
        int[] answer = new int[cnt1];
        
        cnt = 1;
        cnt1 =0;
        
        while(cnt != n + 1){
            if(n % cnt == 0){
                answer[cnt1] = cnt;
                cnt1++;
            }         
            cnt++;
        }   
        return answer;
    }
}