class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        //정수 배열 numbers
        //정수 num1 num2
        //numbers의 num1번 째 인덱스부터
        //num2 번째 인덱스 까지 자른 정수 배열을
        //return 
        int[] answer = new int[num2 - num1 + 1];
        int cnt = 0;
        for(int i = num1; i <= num2; i++)
        { 
            answer[cnt] = numbers[i];
            cnt++;
        }
        return answer;
    }
}

