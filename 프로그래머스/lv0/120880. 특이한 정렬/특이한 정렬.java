class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer   = new int[numlist.length];
        int[] interval = new int[numlist.length];
        int[] orders = new int[numlist.length];
        int   order    = 0;
        
        //간격을 interval에 넣음 
        for(int i = 0; i < numlist.length; i++){
            if(n > numlist[i]){
                interval[i]  = n - numlist[i];
            }else if(n < numlist[i]){
                interval[i] = numlist[i] - n;
            }
        }
        
        //간격이 작은 순서대로 0 ~ n 
        //나보다 작은게 있으면 갯수대로 + 1
       for(int i = 0; i < numlist.length; i++){
           order = 0; 
           for(int j = 0; j < numlist.length; j++){
               if(interval[i] > interval[j]){
                  order += 1;
               }
               orders[i] = order;
           }
       }
    
        for(int i = 0; i < numlist.length; i++){
           for(int j = 0; j < numlist.length; j++){
               if(orders[i] == orders[j] && numlist[i] < numlist[j]){
                  orders[i] += 1;
               }
           }
       }
        
       for(int i = 0; i < numlist.length; i++){
           for(int j = 0; j < numlist.length; j++){
               if(i == orders[j]){
                  answer[i] = numlist[j];
               } 
           }
       }
       return answer;
    }
}