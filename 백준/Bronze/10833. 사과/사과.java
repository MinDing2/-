import java.util.Scanner;

public class Main{

	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			int sum = 0;
			for (int i = 0; i <input; i++) {
				int stuNum = sc.nextInt(); 
				int appleNum = sc.nextInt();
				sum += appleNum %stuNum;
			}	
			System.out.println(sum);
	}
}

