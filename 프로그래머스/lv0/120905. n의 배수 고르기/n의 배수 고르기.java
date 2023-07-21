class Solution {
    public int[] solution(int n, int[] numlist) {
        /*
         *정수 n 배열 numlist 
         *numlist에서 n의 배수가 아닌 수들을 제거하는 배열
         *return
         */  
        int[] answer;
        int c = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n != 0){
                c++;
            }
        }
        answer = new int[numlist.length - c];
        c= 0;

        for(int i = 0; i < numlist.length; i++){
           if(numlist[i] % n == 0)
           {
              answer[c] = numlist[i];
              c++;
           }    
        }
        return answer;
    }
}