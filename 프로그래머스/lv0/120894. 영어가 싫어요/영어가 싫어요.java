class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int i = 0; 
        String str = ""; 
        String num = "";
        
        while(true){
          str +=  numbers.charAt(i);
          i++;
            
          switch(str){
              case "zero"  : num += "0";
                            str = "";
                            break;   
              case "one"  : num += "1";
                            str = "";
                            break;
              case "two"  : num += "2";
                            str = "";
                  break;
              case "three": num += "3";
                            str = "";
                  break;
              case "four" : num += "4";
                            str = "";
                  break;
              case "five" : num += "5";
                            str = "";
                  break;
              case "six"  : num += "6";
                            str = "";
                  break;
              case "seven": num += "7";
                            str = "";
                  break;
              case "eight": num += "8";
                            str = "";
                  break;
              case "nine" : num += "9";
                            str = "";
                             break;
          } 
          if(i == numbers.length()){
             break;
          }        
        }
        answer = Long.parseLong(num);
    
        return answer;
    }
}