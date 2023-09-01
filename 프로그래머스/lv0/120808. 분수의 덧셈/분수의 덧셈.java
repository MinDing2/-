import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //분자
//         numer1
//         numer2
        
//         //분모
//         denom1  denom2
        
        //답을 기약 분수로 나타내야댐 
        
        //일단 분모를 맞춰주고 
        int sum;
        int dm1  = denom1;
        int dm2  = denom2; 
        int num1 = numer1;
        int num2 = numer2; 
        int nSum = 0;
        int dSum = 0;
        boolean tr = true;
        List<Integer> dv = new ArrayList<>(); 
        

        int cnt = 2;
        while(true){
             if(denom1 < denom2){
                 dm1  = denom1 * cnt;
                 num1 = numer1 * cnt; 
                 cnt++; 
             }else if(denom1 > denom2){
                 dm2  = denom2 * cnt;
                 num2 = numer2 * cnt; 
                 cnt++;
             }else{
                 nSum = num1 + num2; 
                 dSum = dm1 + dm2;     
                 
                 //기약분수 확인 되면 break
                 
                 if(nSum > dSum){
                     for(int i = 2; i <= dSum; i++){
                         if(dSum % i == 0){
                            dv.add(i);
                         }
                     }
                     for(int j = 0; j < dv.size(); j++){
                          if(nSum % dv.get(j) == 0){
                              tr = false;// 기약분수 x 
                          }
                     }
                     if(tr){
                         answer[0] = nSum;
                         answer[1] = dSum;
                         break;
                     }else{
                         continue; 
                     }
                     
                 }else if(nSum < dSum){
                       for(int i = 2; i <= nSum; i++){
                         if(dSum % i == 0){
                            dv.add(i);
                         }
                       }  
                     for(int j = 0; j < dv.size(); j++){
                          if(dSum % dv.get(j) == 0){
                              tr = false;// 기약분수 x 
                          }
                     }
                     if(tr){
                         answer[0] = nSum;
                         answer[1] = dSum;
                         break;
                     }else{
                         continue; 
                     }
                 }else{
                     answer[0] = 1;
                     answer[1] = 1;
                 }
             }
        }
        return answer;
    }
}