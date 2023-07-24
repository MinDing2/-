class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] a = new char[num_str.length()];
            
        for(int i = 0; i < num_str.length(); i++){
         a[i] = num_str.charAt(i); 
           answer += (a[i] - 48) % 10;
        }  
        
        return answer;
    }
}