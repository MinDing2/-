class Solution {
    public int solution(int[] common) {
        //등차 등비
   /*
        3부터
        등차인지 등비인지 확인하고
        
        등비이면 마지막값에
        마지막값 / 마지막 전값 을
        마지막 값에 곱해주고 answer에 넣기
            
        등차이면 마지막값 -마지막 전값을
        마지막 값에 더해주고 answer값에 넣기 
    
        등차 등비 확인
        4가지 경우
        등차가 양수,음수
        등비가 양수,음수 
        등차
        01 12        
        양수 인경우
        1 - 0 2 - 1 값이 같다
        단 각각의 값이 부호가 다르면 부호가 바뀐다(절대값은 같음)
        음수인 경우
        등비 
        1 0  2-1 나눈 값 같다
        */
        int answer = 0;
        int[] arr = new int[common.length - 1];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = common[i + 1] - common[i];
        }
        if(common[common.length - 1] / (float)common[common.length - 2] == common[common.length - 2] / (float)common[common.length - 3])
        {
            answer = common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
        }else{
            answer = common[common.length - 1] +arr[arr.length - 1];
        }   
        return answer;
    }
}