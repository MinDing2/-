class Solution {
    public String solution(String my_string, int[][] queries) {
        String copy   = my_string;
        String answer = "";
        String part   = "";  
  
        
        for(int i = 0; i < queries.length; i++){
            StringBuilder sbr = new StringBuilder();
            answer        = "";           //answer 초기화
            part          = "";
            
            for(int j = 0; j < queries[i][0]; j++){ //첫 부분  
                answer += copy.charAt(j);
            }
            
            for(int k = queries[i][0]; k <= queries[i][1]; k++){ //바꾼 부분 
                part += copy.charAt(k);
            }
            
            //바꿔서 첫 부분이랑 합치기
            sbr.append(part);
            sbr.reverse();
            answer += sbr;
            
            for(int l = queries[i][1] + 1; l < copy.length() ; l++){// 중간에 바꾸고 마지막 부분 
                 answer += copy.charAt(l); 
            }
            
            copy = answer;    //값 바꿔주기
        }
        
        return answer;
    }
}