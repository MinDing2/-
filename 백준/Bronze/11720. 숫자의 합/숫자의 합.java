import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		BigInteger sum = new BigInteger("0");
		BigInteger bigTen = new BigInteger("10");
		BigInteger number = scanner.nextBigInteger();	
	
		for(int i = 0; i < num; i++) {
			sum = sum.add(number.remainder(bigTen));
			number = number.divide(bigTen);
		}
		System.out.println(sum);
	}
}