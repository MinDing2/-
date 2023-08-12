import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String str= "";
        int k = 0; 
        
      while(true){  
         for(int i = 0;  i < s.length(); i++){
             for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    str = s.charAt(i) + ""; 
                    s = s.replaceAll(str, ""); 
                }   
             }
         }
          k++; 
          if(k == 10 ){
              break;
          }
      }
        char[] chr = s.toCharArray();
        Arrays.sort(chr);
        
        answer = new String(chr);
        return answer;  
    }
}

