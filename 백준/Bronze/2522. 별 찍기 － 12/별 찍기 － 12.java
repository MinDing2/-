import java.util.*;	
public class Main {
public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	    	for(int j = 1; j < n - i; j++) {
	    		System.out.printf(" ");
	    	}
	    	for(int k = 0; k < i+1; k++) {
	    		System.out.printf("*");
	    	}
	    	System.out.println();
	    }
	    
	    for(int i = 0; i < n; i++) {
	    	for(int j = 0; j < i+1; j++) {
	    		System.out.printf(" ");
	    	}
	    	for(int k = 0; k < n  - (i + 1); k++) {
	    		System.out.printf("*");
	    	}
	    	System.out.println();
	    }
    }
}