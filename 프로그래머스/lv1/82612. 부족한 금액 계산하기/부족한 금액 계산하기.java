class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long value = 0;
        long total = 0;
        
        for(int i = 1; i <= count; i++){
            value = price * i;
            total += value;
            if(money - total < 0 ){
                answer = total - money;
            } 
        }
        return answer;
    }
}