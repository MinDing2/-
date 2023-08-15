class Solution {
    public int solution(int[] sides) {
        int cnt    = 0;
        int first  = 0;
        int second = 0;
        
        if(sides[0] >= sides[1]){
            first = sides[0] - sides[1] + 1; 
            for(int i = sides[0] + 1; i < sides[0] + sides[1]; i++){ 
                cnt++; 
            }
            for(int i = first; i <= sides[0]; i++){   
                cnt++;
            }
        }else{
            second = sides[1] - sides[0] + 1;
            for(int i = sides[1] + 1; i < sides[0] + sides[1]; i++){
                cnt++; 
            }
            for(int i = second; i <= sides[1]; i++){
                cnt++;
            }
        }
        return cnt;
    }
}