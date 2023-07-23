import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] b = new int[a]; 
		
		for (int i = 0; i < a; i++) {
			b[i] = in.nextInt();
		}
		
		
		 
		double max = 0 ;
		double sum = 0; 
		double answer = 0;
	    
		for (int i = 0; i < a; i++) {
			if(max < b[i] ) { 
				max = b[i];
			}
			
		}
		
		for (int i = 0; i < a; i++) {
			sum += ((b[i] / max) * 100); 
		}
		
		answer = sum / a; 
		
		
		
		System.out.printf("%f", answer);
		
	}

}