class Solution {
    public String solution(String cipher, int code) {
        char[] a = new char[cipher.length() / code]; 
        String answer = "";
        
        int n = 0;
	   
        for(int i = 0; i < cipher.length(); i++){
                if((i + 1) % code == 0){
                    a[n] = cipher.charAt(i);
                    n++;         
                }    
        }
        
        answer = new String(a);
               
        return answer;

    }
}