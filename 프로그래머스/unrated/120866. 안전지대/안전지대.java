import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int cnt = 0, size = board.length;
        
        int[][] boardCopy = new int[board.length][board[0].length];
        
        //0으로 초기화
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                boardCopy[i][j] = 0; 
            }
        }
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
               if(board[i][j] == 1){
            //상하좌우 1
                        boardCopy[i][j] = 1;   
                        if(j - 1 >= 0){
                            boardCopy[i][j - 1] = 1;
                        }
                        if(j + 1 < size){
                            boardCopy[i][j + 1] = 1;
                        } 
            //왼쪽 대각선 1
                        if(i - 1 >= 0 && j - 1 >= 0){
                            boardCopy[i - 1][j - 1] = 1;
                        } 
                        if (i - 1 >= 0 && j + 1 < size){
                            boardCopy[i - 1][j + 1] = 1;
                        }
                        if(i - 1 >= 0){
                            boardCopy[i - 1][j] = 1;  
                        }
           // 오른쪽 대각선 1
                        if(i + 1 < size && j - 1 >= 0){
                            boardCopy[i + 1][j - 1] = 1;
                        } 
                        if (i + 1 < size && j + 1 < size){
                            boardCopy[i + 1][j + 1] = 1;
                        }
                        if(i + 1 < size){
                            boardCopy[i + 1][j] = 1;  
                        }
                }   
            }
        }
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(boardCopy[i][j] == 0){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}