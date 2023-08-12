class Solution {
    public String[] solution(String myStr) {
        StringBuilder str = new StringBuilder();
        int cnt = 0;
        
        for(int i = 0; i < myStr.length(); i++){
             if(myStr.charAt(i) == 'a'|| myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c' ) {
                 if(cnt == 0){
                    str.append(' ');
                    cnt++;
                 }
             }else{
                 str.append(myStr.charAt(i));
                 cnt = 0;
             }
        }
        
        String sr = str.toString().trim();
        String[] answer = sr.split(" ");    
        if(answer[0].isEmpty()){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}