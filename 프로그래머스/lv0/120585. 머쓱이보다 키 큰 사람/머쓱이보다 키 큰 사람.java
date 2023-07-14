class Solution {
    public int solution(int[] array, int height) {
        //반 친구들의 키가 담긴
        //정수 배열 array와 
        //머쓱이의 키 height
        //머쓱이보다 키 큰사람 수를 return 
        int answer = 0;
        
        for(int i = 0; i < array.length; i++)
            if(array[i] > height)
                answer++;
        
        return answer;
    }
}