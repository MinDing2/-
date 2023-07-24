class Solution {
    public String solution(String my_string, int k) {
        String[] a = new String[k];
        String answer = "";
        
        for(int i = 0 ; i < k; i++) {
          a[i] = my_string;        
          answer += a[i];
        }
        
       
        
        
        return answer;
    }
}