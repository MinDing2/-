class Solution {
    public int solution(String str1, String str2) {

        //문자열 str1 str2가 매개변수 
        //str1 안에 str2 가 있다면 
        //있다면 1 없다면 2를 return; 
         
        int answer = 0;
       if(str1.contains(str2)){  
           answer = 1;
           return answer; 
        }
        else{
            answer = 2;
            return answer;
        }
    }
}