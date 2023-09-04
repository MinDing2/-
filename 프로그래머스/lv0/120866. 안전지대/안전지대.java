import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0, a = board.length, b = board[0].length, cnt = 0,one = 0, two = 0;
        int[][] boardCopy = new int[a][b];
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                boardCopy[i][j] = 0; 
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
               if(board[i][j] == 1){
            //i
                        boardCopy[i][j] = 1;   
                        if(j - 1 >= 0){
                            boardCopy[i][j - 1] = 1;
                        }
                        if(j + 1 < b){
                            boardCopy[i][j + 1] = 1;
                        } 
            //i - 1
                        if(i - 1 >= 0 && j - 1 >= 0){
                            boardCopy[i - 1][j - 1] = 1;
                        } 
                        if (i - 1 >= 0 && j + 1 < b){
                            boardCopy[i - 1][j + 1] = 1;
                        }
                        if(i - 1 >= 0){
                            boardCopy[i - 1][j] = 1;  
                        }
           // i + 1 
                        if(i + 1 < a && j - 1 >= 0){
                            boardCopy[i + 1][j - 1] = 1;
                        } 
                        if (i + 1 < a && j + 1 < b){
                            boardCopy[i + 1][j + 1] = 1;
                        }
                        if(i + 1 < a){
                            boardCopy[i + 1][j] = 1;  
                        }
                }   
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(boardCopy[i][j] == 0){
                    cnt++;
                }
            }
        }
        
        answer = cnt; 
    
        return answer;
    }
}