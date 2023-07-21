class Solution {
    public String solution(String my_string) {
        //my_string이 매개변수로 주어질 때 
        //대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return 하도록
        //solution 함수를 완성해주세요 
        char[] a = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            if(65 <= my_string.charAt(i) && my_string.charAt(i) <= 90){
               a[i] = my_string.charAt(i);
               a[i] += 32; 
            }
            else{
               a[i] = my_string.charAt(i);
               a[i] -= 32; 
            }
        }
        
        String answer = new String(a);
        return answer;
    }
}