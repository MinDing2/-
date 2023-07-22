class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] a = new char[myString.length()];
            
        for(int i = 0; i < myString.length(); i++){
            a[i] = myString.charAt(i); 
            
            if(a[i] < 97){
               a[i] += 32;
            }
            
        }
        answer = new String(a);
        
        return answer;
    }
}