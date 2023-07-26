import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] answer = new char[a.length()];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = a.charAt(i);
        	if(96 < answer[i]) {
        		answer[i] -= 32;
        	}else {
        		answer[i] += 32; 
        	}
        	System.out.printf("%c", answer[i]);
		}       
    }
}