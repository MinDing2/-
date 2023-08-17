class Solution {
    public int solution(int n) {
        String str = "";
        int answer = 0;
        boolean fs = false; 
        
        for(int i = 1; i <= n; i++){
            str = String.valueOf(i);
            
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(j) == '3'){
                        fs = true;
                    }
                }
            
                    if(fs){
                        n  += 1;
                    }else if(i % 3 == 0){
                        n  += 1;
                    }
                    answer = n;
                    fs = false;   
        }       
        return answer;
    }
}