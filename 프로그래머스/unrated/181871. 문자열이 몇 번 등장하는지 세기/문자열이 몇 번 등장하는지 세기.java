class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
           
        for(int i = 0; i < myString.length(); i++){
            for(int j = i; j < pat.length() + i; j++){
                if(pat.length() + i > myString.length()){
                    break;
                }
                str += myString.charAt(j);
            }
            if(str.equals(pat)){
                answer++;
            }
            str ="";
        }
        
        return answer;
    }
}