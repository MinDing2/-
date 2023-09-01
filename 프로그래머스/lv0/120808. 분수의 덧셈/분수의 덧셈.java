import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
       
        //분모 분자 서로 곱해서 
        //분모 분자를 맞춰줌
        int denom   = denom1 * denom2;//16
        int n1  = numer1 * denom2;//16
        int n2  = numer2 * denom1;//16
        int nSum = n1 + n2;//32
        int denomCopy = denom;
        int nSumCopy  = nSum;
        
        if(denom >= nSum){//16 32
            for(int i = 2; i <= nSum; i++){
                if(denom % i == 0 && nSum % i == 0){
                    denomCopy = denom / i;
                    nSumCopy  = nSum / i;
                } 
            }
        }else if(denom < nSum){//16 32 작동 
            for(int i = 2; i <= denom; i++){// 2부터 16 까지  
                if(denom % i == 0 && nSum % i == 0){//16 % i 가 0 32 % i 가  0이면 
                    denomCopy = denom / i;// 16 / 2 = 8
                    nSumCopy  = nSum / i;//  32 / 2 = 16 
                }
            }
        }
        //나누는 수 i가 분모보다 작을 경우에도 약분이 가능하다면 약분해줄 수 있게 
        answer[0] =  nSumCopy;
        answer[1] =  denomCopy;
        
        return answer;
    }
}