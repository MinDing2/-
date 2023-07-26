class Solution {
    public int solution(int n) {
        int sum1 = 0;
		double sum2 = 0;
		if(n % 2 == 1) {
			for (int i = 1; i <= n; i++) {
				if(i % 2 == 1) {
					sum1 += i; 
				}
			}
			return sum1;
		}
		else {
			for (int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					sum2 += Math.pow(i, 2);
				}
			}
			return (int)sum2;
		}
		
    }
}