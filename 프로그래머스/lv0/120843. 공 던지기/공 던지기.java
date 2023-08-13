class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0; 
        int cnt = 0;
        
        while(true){
            cnt++; 
            if(cnt == k){
                answer = i + 1;
                break;
            }     
            i += 2; 
            if(i >= numbers.length){
               i -= numbers.length;
            }
        }
        return answer; 
    }
}