class Solution {
    public int solution(int[] dot) {
        
   
        //1사분면 모두 양수
        //2사분면 x음수 y 양수
        //3사분면 xy 음수
        //4 x양사 y 음수 
        
        //4분면 1(3,2),2(-3,2),3(-3,-2),4(3,-2)
        
        //좌표를 차례대로담은
        //dot이 매개변수로 주어짐
        //dot이 어디에속하는지 1,2,3,4, 중 하나를 return하게
        //dot[0] x좌표 dot[1]은  y좌표 
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0)
            answer = 1;
        else if(dot[0] < 0 && dot[1] > 0)
            answer = 2;
        else if(dot[0] < 0 && dot[1] < 0)
            answer = 3;
        else
            answer = 4; 
            
            
        return answer;
        
    }
}