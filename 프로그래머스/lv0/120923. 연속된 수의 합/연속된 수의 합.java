class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum      = 0;
        int startNum = 0;
        int cnt      = 0;
        
        for(int i = 1; i <= num; i++){
            sum += i; 
        }
        
        startNum  = 1 + ((total - sum) / num);
        
        for(int i = startNum; i < startNum + num; i++){
            answer[cnt] = i;
            cnt++;
        }    
        return answer;
    }
}