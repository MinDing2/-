class Solution {
    public String solution(String my_string, int n) {
        int a = my_string.length() - n; 
        char[] b = new char[ n ];
        int c = 0;
        
        for(int i = a ; i < my_string.length(); i++){
              b[c] = my_string.charAt(i);
              c++;
        }
        
        String answer = new String(b);
        
        return answer;
    }
}