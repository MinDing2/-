class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] answer = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
              answer[i] = my_string.charAt(i);
        }
        
        int cnt = 0;
        for(int i = s; i < overwrite_string.length() + s; i++){
              answer[i] = overwrite_string.charAt(cnt);
              cnt++;
        }
        
        String answer1 = new String(answer);
        
        return answer1;
    }
}