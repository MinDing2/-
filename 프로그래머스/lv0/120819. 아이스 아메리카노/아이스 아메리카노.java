class Solution {
    public int[] solution(int money) {
        /*
         *아아메 5500원
         *가진돈 money
         *최대로 마실 수 있는 아아메
         *잔 수와 남는 돈을 순서대로 담은
         *배열 return
         */
        int[] answer = {0,0};
        
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        
        
        
        return answer;
    }
}