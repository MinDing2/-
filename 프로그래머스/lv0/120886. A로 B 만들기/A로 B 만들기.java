class Solution {
    public int solution(String before, String after) {
        int a = 0;
        int b = 0; 
        int answer = 0;

        for(int i = 0; i < before.length(); i++){
                 b += before.charAt(i);
                 a += after.charAt(i); 
        }
        
        if(a == b){
            answer = 1;
        }else{
            answer = 0; 
        }
        
        return answer;
    }
}
