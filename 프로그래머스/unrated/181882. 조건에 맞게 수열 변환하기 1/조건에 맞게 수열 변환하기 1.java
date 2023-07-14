class Solution {
    public int[] solution(int[] arr) {
        //arr의 각 원소에 대해 값이 50보다 크거나
        //같은 짝수라면 2로나누고 
        //50보다 작은 홀수라면 2를 곱합니다. 
        //그 결과인 정수를 리턴 
       
        int[] answer = new int[arr.length];
        
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 50 && arr[i] % 2 == 0)
            {
                arr[i] /= 2;
            }
            else if(arr[i] < 50 && arr[i] % 2 == 1)
            {
                arr[i] *= 2;
            }
            answer[i] = arr[i];
        }
        
        return answer;
    }
}