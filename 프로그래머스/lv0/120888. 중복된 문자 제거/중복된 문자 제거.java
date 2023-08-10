class Solution {
    public String solution(String my_string) {
        String answer ="";
        char[] chr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            chr[i] += my_string.charAt(i);
            for(int j = 0; j < i; j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                  chr[i] = '1';   
                }
            }
        }
        
        answer = String.valueOf(chr);
        answer = answer.replaceAll("1", "");
        return answer;
    }
}