class Solution {
    
    public int[] solution(int[][] score) {
        double[] average = new double[score.length];
        int[] answer = new int[score.length];
            
        for(int i = 0; i < score.length; i++){
            average[i] = (score[i][0] + score[i][1]) / 2.0;   
        }
        
        int grade = 1;
        
        for(int i = 0; i < average.length; i++){
            for(int j = 0; j < average.length; j++){
                if(average[i] < average[j]){
                    grade++;
                }
            }
            answer[i] = grade;
            grade     = 1;
        }
        return answer;
    }
}