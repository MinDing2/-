import java.util.*;

public class Main {

	public static  void main(String[] args) {
		/*
		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		*/
		 //3 3 6
     	//1300
	    //222
	   //12000
		Scanner in = new Scanner(System.in);
		
     	//	int a = in.nextInt();
		//int b = in.nextInt();
		//int c = in.nextInt();
		
		int[]a = new int[3];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int max = 0;
		
		int answer = 0;
		if(a[0] == a[1] && a[0] == a[2]){
			answer = a[0] * 1000 + 10000;
		}
		else if(a[0] == a[1] || a[0] == a[2] ){
			answer = 1000 + a[0] * 100;
		}
		else if ( a[1] == a[2]){
			answer = 1000 + a[1] *100;
		}
		else {
			for (int i = 0; i < a.length; i++) {
				if(max < a[i]) {
					max = a[i];
				}
			}
			answer = max * 100;			
		}
		System.out.println(answer);
		
	}
}
