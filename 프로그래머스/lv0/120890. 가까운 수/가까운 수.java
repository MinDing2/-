class Solution {
    public int solution(int[] array, int n) {
        int[] num = new int[array.length];
        int compare = 0; 
        int answer = 0; 
        int cnt = 0;
        
        for(int i = 0; i < array.length; i++){
            num[i] = n - array[i];
            if(num[i] < 0){
                num[i] = -num[i]; 
            }
        }

        compare = num[0];

        for(int i = 0; i < array.length; i++){
            if(compare >= num[i]){
                compare = num[i];
            }
        }
        
         for(int i = 0; i < array.length; i++){
             if(compare == num[i]){
                cnt++;  
             }
         }
        
        int[] a = new int[cnt];
        cnt = 0;
        
         for(int i = 0; i < array.length; i++){
            if(compare == num[i]){
                a[cnt] = array[i];
                cnt++;
            }
         }
        
        int compare1 = a[0];
      
        for(int i = 0; i < a.length; i++){
             if(compare1 > a[i]){
                 compare1 = a[i];
             }
         }
        return compare1;
    }
}