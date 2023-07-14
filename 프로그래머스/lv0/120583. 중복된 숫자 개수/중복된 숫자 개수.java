class Solution {
    public int solution(int[] array, int n) {
         int answer = 0;
        /*
         *정수가 담긴 배열array 와 정수 n이 매개변수로 주어짐
         *array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 
         *완성해 보세요  
         */
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == n)
                answer += 1;
        }
       
        return answer;
    }
}