class Solution {
    public int solution(int[] arr1, int[] arr2) {
        //두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
        //배열의 길이가 같다면 
        //각 배열에 있는 모든 원소의 합을 비교하여
        //다르다면 더 큰 쪽이 크고, 같다면 같습니다.
        
        //두 정수 배열 arr1과 arr2가 주어질 때,
        //위에서 정의한 배열의 대소관계에 대하여 
        //arr2가 크다면 -1, arr1이 크다면 1,
        //두 배열이 같다면 0을 return
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0; 
        
        
        //배열의 길이가 같다면
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];    
                sum2 += arr2[i];
            }
    
            if(sum2 > sum1)    
                return -1;
            else if(sum1 > sum2)
                return 1;
            else
                return 0; 
    }
        
        if(arr1.length > arr2.length)  //arr1 배열이 arr2 보다 크다면
            return 1;
        else
            return -1; // arr2가 arr1보다 큰 경우가 남는다. 
    }
}