import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine(); 
    
        char[] answer = new char[a.length()];
        
        
        for(int i = 0; i < a.length(); i++ ){
            
            answer[i] =a.charAt(i);       
            if(answer[i] >= 97){
                answer[i] -=32;
            }
            else{
                answer[i] +=32;
            }
            
            System.out.print(answer[i]);
        }
    }
}