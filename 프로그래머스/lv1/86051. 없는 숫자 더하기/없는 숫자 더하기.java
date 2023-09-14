class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean tr = true;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == numbers[j]){
                     tr = false;
                }
            }
            if(tr){
                answer += i;
            }
            tr = true;
        }
        return answer;
    }
}