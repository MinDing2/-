class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int lambPrice = 12000;
        int priceDrink = 2000;
        
        answer = (n * lambPrice) + (k * priceDrink) - ((n / 10) * 2000);
        
        return answer;
    }
}