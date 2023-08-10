class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        
        for(int i = 0; i < str.length(); i++){
            for(char x = 'a'; x < 'k'; x++){
               if(str.charAt(i) == x - 49){
                   answer += x; 
               }
            }
        }
        return answer;
    }
}