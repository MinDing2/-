class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1];
        String str = ""; 
        int cnt = 0;
        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                cnt++;
            }else if(cnt == 0){
                answer[0] = n; 
                return answer; 
            }
        }
        
        cnt = 0;
        int cnt1 = 0;
        for(int i = 2; i < n; i++){
            while(n % i == 0){
                n /= i;
                if(cnt == 0){
                    str += String.valueOf(i);
                    cnt++;
                    cnt1++;
                }else if(n == 1){
                    break;
                }
            }
            cnt = 0; 
        }
        
        
    int[] answer1 = new int[cnt1];
        
    for(int i = 0; i < cnt1; i++){
        answer1[i] = str.charAt(i) -48;
    }
    
    return answer1;
        
        
    }
}