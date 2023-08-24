class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int leftNum  = 0; 
        int rightNum = 0;
        
        for(int i = 0; i< quiz.length; i++){
            String[] str = quiz[i].split(" ");
            for(int j = 0; j < str.length; j ++){
                if(str[j].equals("+")){
                    leftNum = Integer.parseInt(str[j - 1]) + Integer.parseInt(str[j + 1]);
                }else if(str[j].equals("-")){
                    leftNum = Integer.parseInt(str[j - 1]) - Integer.parseInt(str[j + 1]);
                }else if(str[j].equals("=")){
                    rightNum = Integer.parseInt(str[j + 1]);
                }
            }
            
            if(leftNum == rightNum){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
            leftNum  = 0;
            rightNum = 0;
        }        
        return answer;
    }
}