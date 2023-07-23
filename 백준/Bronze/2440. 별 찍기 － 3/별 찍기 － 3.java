import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 0; i < a; i++) {

			for (int k = 0; k < a - i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}