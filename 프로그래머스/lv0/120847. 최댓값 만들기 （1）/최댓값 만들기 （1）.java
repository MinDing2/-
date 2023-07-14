import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        //정수 배열 numbers가 매개변수로 주어집니다
        //numbers의 원소 중 두 개를 곱해 만들 수 있는
        //최댓값을 return하도록 solution 함수를 완성해주세요.
        
  
        int max1 = 0;
        int max2 = 0;
        int answer = 0;
        Arrays.sort(numbers);     
        max1  = numbers[numbers.length - 1];
        max2  = numbers[numbers.length - 2];
       
        
        answer = max1 * max2; 
 
     
        return answer;
    }
}