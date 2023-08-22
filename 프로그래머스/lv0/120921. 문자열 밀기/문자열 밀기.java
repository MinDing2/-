class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = "";
        int cnt    = 0;
        
    while(true){
        if(A.equals(B)){
            break;
        }else{
         for(int i = 0; i < A.length(); i++){
             if(i == 0){
                 str += A.charAt(A.length() - 1);
             }else{
                 str += A.charAt(i - 1);
             }
           }
        }
        A = str;
        answer++;
        
        if(str.equals(B)){
            break;
        }else if(answer == A.length() - 1){
            answer = -1;
            break;
        }else{
            str = ""; 
        }     
    }
        
        return answer;
        
    }
}