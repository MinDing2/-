import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
/* 
 * i는 n만큼 
 * j1 
 * 1
 * 1-2
 * 1-n
 */      
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for(int j = 0; j < 1 + i; j++){
                System.out.printf("*");
            }
             System.out.println();
        }
       
    }
    
}