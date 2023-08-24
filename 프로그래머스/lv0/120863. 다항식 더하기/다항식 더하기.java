class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int xNum = 0; 
        String[] aryStr = polynomial.split(" "); 
        
        for(String s : aryStr){
            if(s.equals("x")){
                xNum += 1;
            }else if(s.contains("x")){
                 if(s.length() == 2){
                     xNum += s.charAt(0) - 48;
                 }
                 else if(s.length() == 3){
                     xNum += (s.charAt(0) - 48) * 10 + s.charAt(1) - 48;
                 }
            }else if(!s.equals("+")){
                num += Integer.parseInt(s);
            }
        }
 
        if(num == 0){
            if(xNum == 1){
                answer = "x";
            }else{      
                answer = xNum + "x";
            }
        }else if(xNum == 0){
            answer = num + "";
        }else{
             if(xNum == 1){
                answer = "x" + " " + "+" + " " + num;
            }else{      
                answer = xNum + "x" + " " + "+" + " " + num;
            }
        }
        return answer;
    }
}