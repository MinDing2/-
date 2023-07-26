class Solution {
    public int solution(int a, int b) {
   
			int answer  = 0; 
			int answer1 = 0;
            int num = a; 
        
			if (b / 10 == 0) {           // b가 1의자리
				num *= Math.pow(10, 1);    // a에 10곱함
				answer = num + b;  
			} else if ((b / 10) < 10) {  //  10의자리 라면
				num *= Math.pow(10, 2);    //  100
				answer = num + b;
			} else if ((b / 10) < 100) { // 10의자리
				num *= Math.pow(10, 3);    // 1000
				answer = num + b;
			} else {                     // 1000의 자리
				num *= Math.pow(10, 4);   // 10000
				answer = num + b;
			} 
        
            
            
            if ((a / 10) == 0) {         // a가 1의자리
				b *= Math.pow(10, 1);    // b에 10곱함
				answer1 = a + b;  
			} else if ((a / 10) < 10) {  //  10의자리 라면
				b *= Math.pow(10, 2);    //  100
				answer1 = a + b;
			} else if ((a / 10) < 100) { // 10의자리
				b *= Math.pow(10, 3);    // 1000
				answer1 = a + b;
			} else {                     // 1000의 자리
				b *= Math.pow(10, 4);    // 10000
				answer1 = a + b;
			} 
        
        
	        if(answer1 > answer){
			    return answer1;
            }else{
                return answer; 
            }
    }
}