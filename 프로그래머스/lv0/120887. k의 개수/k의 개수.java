class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for(int c = i; c <= j; c++){
            str = String.valueOf(c); 
            for(int v = 0; v < str.length(); v++){
                if(str.charAt(v) == k + 48){
                   answer++;  
                }
            }
        }
        return answer;
    }
}


