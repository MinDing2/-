import java.util.*;
class Solution {
    public String solution(String my_string) {   
        String answer = "";
        char[] chr = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i ++){   
             if( 96 > my_string.charAt(i)){
                chr[i] = (char)(my_string.charAt(i) + 32);   
             }else{
                chr[i] = my_string.charAt(i);
             }
        } 
        Arrays.sort(chr);
        answer = String.valueOf(chr);
        return answer;
    }
}