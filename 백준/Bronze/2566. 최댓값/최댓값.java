import java.util.*;

public class Main{
    
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			int[][] answer = new int[9][9];
			int maxValue = 0;
			int a = 1;
			int b = 1;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					answer[i][j] = in.nextInt();
					if(maxValue < answer[i][j]) {
						maxValue = answer[i][j];// 최대값 찾기 
						a = i + 1;
						b = j + 1;
					}
				}
			}
			System.out.println(maxValue);
			System.out.println(a + " " + b);
	}
}