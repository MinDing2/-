class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int row = M;
        int col = N;
        answer = row - 1 +(col - 1) * row;
        return answer;
    }
}
//r - 1 + (c-1) * r