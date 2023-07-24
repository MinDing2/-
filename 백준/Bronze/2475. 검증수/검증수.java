import java.util.Scanner;

public class Main{

	public static  void main(String[] args) {
		//0 4 2 5 6
		//1

		Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		int answer = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt(); 
			a[i] = a[i] * a[i];
			sum += a[i];
		}
		answer = sum % 10;
		
		System.out.println(answer);
	}
}