import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String c = a + b;
        //replaceAll([정규식],[바꿀문자])
        c.replaceAll(" ", "");
        System.out.println(c);
    }
}