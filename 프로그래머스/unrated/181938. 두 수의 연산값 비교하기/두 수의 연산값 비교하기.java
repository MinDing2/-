class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(""+ a + b);
		int strSum = Integer.parseInt(str);
		int sum = 2 * a * b;
        
		if(sum > strSum) {
			return sum;
		}else{
			return strSum;
		}
    }
}