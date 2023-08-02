class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int s = 0;
        int e = 0;
        int k = 0; 
        // 0,0 s
        // 0,1 e
        // 0,2 k 
        // arr의 인덱스 번호 i 
        //s <= i <= e
        //i가 k 의 배수이면 arr[i]에 1을 더함 
        for(int i = 0; i < queries.length; i++){
           s = queries[i][0];
           e = queries[i][1];
           k = queries[i][2];
           for(int j = s; j <= e; j++){
                if(j % k == 0){
                    arr[j] += 1;         
                }
            }   
        }
            
        return arr;
    }
}