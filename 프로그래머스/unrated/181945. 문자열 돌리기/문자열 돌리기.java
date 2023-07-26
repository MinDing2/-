import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        char[] answer = new char[a.length()];
	        
	    for(int i = 0; i < a.length(); i++){
	        answer[i] = a.charAt(i);
	        System.out.println(answer[i]);
	    }
    }
}