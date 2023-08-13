class Solution {
    public int[] solution(int n) {
     
        String str = ""; 
        int cnt = 0;
        boolean tr = true;
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
               if(tr){
                    str += String.valueOf(i) + " ";
                    tr = false; 
                    cnt++;
                }
                n = n / i;
            }
            tr = true; 
        }

    int[] answer = new int[cnt];
    String[] st = str.split(" ");
        
    for(int i = 0; i < cnt; i++){
        answer[i] = Integer.parseInt(st[i]);
    }
        
    return answer;  
        
    }
}
