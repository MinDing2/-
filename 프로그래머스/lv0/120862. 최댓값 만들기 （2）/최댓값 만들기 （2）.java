class Solution {
    public int solution(int[] numbers) {
        /*
         * 정수 배열 numbers
         * numbers의 원소 중 
         * 두개를 곱해 만들 수 있는 최댓값
         * return
         *
         */
        
        int answer = -100000000;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(answer < numbers[i] * numbers[j] && i != j) {
                      answer = numbers[i] * numbers[j];
                }   
            }        
        }
        
        return answer;
    }
}