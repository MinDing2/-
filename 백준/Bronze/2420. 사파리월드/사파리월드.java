import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		long c = a - b;
	
		if(c < 0) {
			c = -c;	
			System.out.println(c);
		}
		else {
			System.out.println(c);
		}

	}
}