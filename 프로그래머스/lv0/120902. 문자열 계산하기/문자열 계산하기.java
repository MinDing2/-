class Solution {
    public int solution(String my_string) {
        my_string += " ";
		int answer = 0;
        int oCnt = 0;
        int nCnt = 0;
        String str = "";
        boolean tr = true; 
        
        for(int i = 0; i < my_string.length(); i ++){
            if(my_string.charAt(i) == '+' || my_string.charAt(i) ==  '-'){  
                oCnt++; 
            }
        }

        for(int i = 0; i < my_string.length(); i ++){
            if(my_string.charAt(i) != '+' && my_string.charAt(i) !=  '-' && my_string.charAt(i) !=  ' '){  
                str += " "; 
                tr = true;
            }else{
            	if(tr) {
            	  nCnt++; 
            	  tr = false; 
            	}
            }
        }

        String[]  operator = new String[oCnt];
        String[]  num      = new String[nCnt + 1];
        
        oCnt = 0;
        nCnt = 0;

        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == '+' ){
                operator[oCnt] = "+";
                oCnt++;
            }else if(my_string.charAt(i) ==  '-'){
                operator[oCnt] = "-";
                oCnt++;
            }
        }
                
        tr = true; 
        str = ""; 
       
        for(int i = 0; i < my_string.length(); i++){
  
             if(my_string.charAt(i) != '+' && my_string.charAt(i) !=  '-' && my_string.charAt(i) !=  ' '){  
                  str += my_string.charAt(i) + "";
                  tr = true;
             }else{                
                if(tr){
                	num[nCnt] = str; 
                    System.out.println(num[nCnt]);
                    nCnt++;
                	str = "";
                	tr = false;
                }
             }
        }

       int cnt = 0;
       
       for(int i = 0; i < oCnt; i++){
         if(operator[i].equals("+") && cnt == 0){
             answer  += Integer.parseInt(num[i]);
             answer  += Integer.parseInt(num[i + 1]);
             cnt++;
         }else if(operator[i].equals("+")){
             answer  +=  Integer.parseInt(num[i + 1]);
         }else if (operator[i].equals("-") && cnt == 0){
        	    answer  += Integer.parseInt(num[i]);
                answer  -= Integer.parseInt(num[i + 1]);
                cnt++;
         }else {
        	    answer  -=  Integer.parseInt(num[i + 1]);
         }
      }
        
     return answer;
    }
}