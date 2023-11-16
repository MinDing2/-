import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int test = scanner.nextInt();
		int sum = 0, num = 0;
		for(int i = 0; i < test; i++) {
			String str = scanner.next();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 79) {
					num += 1;
					sum += num;
				}else{
					num = 0;
				}
			}
			System.out.println(sum);
			sum = 0;
			num = 0;
		}
	}
}