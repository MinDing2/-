import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int num = 0;
		
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for (int i = 0; i < 2; i++) {
			

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					num = in.nextInt();
					
					if (i == 0) {
						arr1[j][k] = num;
					} else {
						arr2[j][k] = arr1[j][k] + num;
						System.out.printf("%d ", arr2[j][k]);
					}
				}
				if (i == 1) {
					System.out.println();
				}
			}
		}

	}

}