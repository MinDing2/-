class Solution {
    public int solution(String my_string) {
        char[] arr = new char[my_string.length()];
        int answer = 0;
        
        for(int i = 0;i < my_string.length(); i++){
              if (Character.isDigit(my_string.charAt(i))) {
                answer += Character.getNumericValue(my_string.charAt(i));
                  
                  
       //       if(48 <= (int)my_string.charAt(i) && (int)my_string.charAt(i) <= 57)
       //           answer += (int)my_string.charAt(i)) - 48;
       
            }
        }
        return answer;
    
    }
    
}