class Solution {
    public int[] solution(int[] num_list) {
        //정수가 담긴 리스트num_list 가 주어질때
        //num_list의 원소중
        //짝수와 홀수의 개수를 담은 배열을 return 
        int cnt1 = 0;
        int cnt2 = 0;     
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0)
            {
                cnt2 += 1;
            }
            else
            {
                cnt1 += 1;
            }
        }
        
        int[] answer = {cnt2, cnt1};
        return answer;
    }
}