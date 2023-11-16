import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int num = scanner.nextInt();
        
		System.out.println(str.charAt(num-1));
	}
}