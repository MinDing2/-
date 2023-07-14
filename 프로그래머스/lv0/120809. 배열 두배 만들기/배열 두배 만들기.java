class Solution {
    public int[] solution(int[] numbers) {
        //numbers 
        //numbers의 각 원소에 두배한 
        //원소를 가진 배열을 return
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++)
            answer[i] = numbers[i] * 2;
        
            
        return answer;
    }
}