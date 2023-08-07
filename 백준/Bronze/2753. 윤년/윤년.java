import java.util.Scanner;

public class Main{
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

     int leapYear = scanner.nextInt();

     if(leapYear % 400 == 0)
     {
        System.out.println(1);
     }
     else if(leapYear % 100 == 0)    
     {
         System.out.println(0);
     }  
     else if(leapYear % 4 == 0)
     {
         System.out.println(1);
     }
     else
     {
        System.out.println(0);
     }
   }
}
