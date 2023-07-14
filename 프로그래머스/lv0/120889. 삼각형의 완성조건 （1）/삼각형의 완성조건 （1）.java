import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        /*
         *선분 3개로 삼각형을 만드는 조건 
         *가장 긴 변의 길이는 다른 두변 합보다 작아야한다
         *삼각형의 세 변의 길이가 담긴 배열 slides
         *세변으로 삼각형 만들어지면 1 , 아니면 2
         * 
         */
        
        Arrays.sort(sides);
        
        int answer = 0;
       // for(int i = 0; sides.length; i++)
            if(sides[2] < (sides[0] + sides[1]))
                answer = 1;
            else 
                answer = 2;

           return answer;
    }
}