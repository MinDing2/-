//문제 치킨 한마라딩 쿠폰 하나 
//쿠폰 열장 -> 치킨 한마리(혜자누)
//서비스 치킨에도 쿠폰준데-> 혜자누
//시켜먹은 치킨수 chicken 매개변수 주어짐 
//받을 수 있는  쿠폰으로 먹을 수 있는 치킨의 수를
//return 


class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int cupounCnt = 0;
        int add = 0;
        
        while(true){
          answer    += chicken  / 10 ;
          chicken    = chicken / 10 + chicken % 10;
    
          if(chicken  < 10){
              break;
          }
        }
        return answer;
    }
}
//<!--! 치킨 !--! 치킨 !--! 치킨 !--! 치킨 -->
///!치킨!/

