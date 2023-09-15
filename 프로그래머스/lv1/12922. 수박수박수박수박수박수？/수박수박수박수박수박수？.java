class Solution {
    public String solution(int n) {
        int idx = 0; 
        String answer = "";
        
        while(true){
           if(idx % 2 == 0){
              answer += "수";
              idx++;
           }else{
              answer += "박";
              idx++;
           }
            
           if(idx == n){
              break;
           }
            
        }
        return answer;
    }
}