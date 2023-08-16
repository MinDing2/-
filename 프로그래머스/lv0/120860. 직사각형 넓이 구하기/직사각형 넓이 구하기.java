class Solution {
    public int solution(int[][] dots) {
        int answer  = 0;
        int xTop    = dots[0][0];
        int xBottom = dots[0][0];
        int yTop    = dots[0][1];
        int yBottom = dots[0][1];    
    
        int width  = 0; 
        int height = 0;
        
        for(int i = 0; i < 4; i++){
               if(xTop < dots[i][0]){
                 xTop = dots[i][0];   
               }else if(xBottom > dots[i][0]){
                   xBottom = dots[i][0]; 
               }
            
               if(yTop < dots[i][1]){
                   yTop = dots[i][1];   
               }else if(yBottom > dots[i][1]){
                   yBottom = dots[i][1]; 
               }
        }
        
        answer = (xTop - xBottom) * (yTop - yBottom);
        
        return answer;
    }
}