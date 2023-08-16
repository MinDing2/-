class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int arrFirst  = arr.length;
        int arrSecond = arr[0].length; 
        
        if(arrFirst >= arrSecond){
            answer = new int[arrFirst][arrFirst];
            for(int i = 0; i < arrFirst; i++){
                for(int j = 0; j < arrSecond; j++){
                    answer[i][j] = arr[i][j]; 
                }
            }
            for(int i = 0; i < arrFirst; i++){
                for(int j = arrSecond; j < arrFirst; j++){
                    answer[i][j] = 0; 
                }
            }
        }
        if(arrFirst < arrSecond){
            answer = new int[arrSecond][arrSecond];
            for(int i = 0; i < arrFirst; i++){
                for(int j = 0; j < arrSecond; j++){
                    answer[i][j] = arr[i][j]; 
                }
            }
            for(int i = arrFirst; i < arrSecond; i++){
                for(int j = 0; j < arrSecond; j++){
                    answer[i][j] = 0; 
                }
            }
        }
        return answer;
    }
}