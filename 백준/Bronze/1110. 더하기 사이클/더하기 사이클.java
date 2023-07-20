
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int tmp = n;    //대체 값
        int count = 0;
        while(true){
            
           int seatFirst = ((tmp / 10) + (tmp % 10)) % 10;     // 10의 자리값 + 1의 자리 값 에 1의자리 수를 구한 값
        
           int tenPlace = (tmp % 10) * 10;   // 1의 자리 수를 * 10 해서 10의 자리 수 자리를 가짐 
        
           int sum = tenPlace + seatFirst;

           count++; 
            
           if(sum  == n)
           {
             System.out.println(count);
             break;
           }

             tmp = sum;        //tmp 값 갱신.  
        }
        scanner.close();
    }
}

