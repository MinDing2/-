import java.lang.Math;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int hol = 0; 
        int jac = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1) {//홀수갯수
               hol++;
            }
            else{//짝수 갯수
                jac++;
            }                
        }
        
        double[] a = new double[hol];
        double[] b = new double[jac];
        int cnt  = 0;
        int cnt3 = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){//홀수 
                a[cnt] = num_list[i];// 할당 
                cnt++;
            }
            else{//짝수
                b[cnt3] = num_list[i];//할당
                cnt3++;
            }
        }
        
        int cnt1 = 0;
        int cnt2 = 0;
        int sum1 = 0;
        
        for(int i = hol; i  > 0; i--){  //홀수합
            a[cnt1] = a[cnt1] * Math.pow(10, hol - (cnt1 + 1));
            sum1 += a[cnt1]; 
            cnt1++;
        }
        
         for(int i = jac; i  > 0; i--){ //짝수합 
            b[cnt2] = b[cnt2] * Math.pow(10, jac - (cnt2 + 1));
            sum += b[cnt2]; 
            cnt2++;
        }
      
      
        answer = sum1 + sum; 
        
        return answer;
    }
}