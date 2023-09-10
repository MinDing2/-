class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        while(true){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
            i++;
        }
        return answer;
    }
}