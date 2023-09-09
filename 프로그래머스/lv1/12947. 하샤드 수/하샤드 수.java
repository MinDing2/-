class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; 
        String str = String.valueOf(x);
        
        for(int i = 0 ; i < str.length(); i++){
            sum += str.charAt(i) - 48;
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}