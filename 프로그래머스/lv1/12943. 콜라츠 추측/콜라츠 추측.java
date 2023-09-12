class Solution {
    public int solution(int num) {
        
        int answer  = 0;
        long number = num;
        while(true){
                if( number  == 1){
                   break;
                }else if(number % 2 == 0){
                answer++;
                number /= 2;
                if(answer == 501){
                    answer = -1;
                    break;
                }
            }else if(number % 2 == 1){
                answer++;
                number = number * 3 + 1;
                if(answer == 501){
                    answer = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}