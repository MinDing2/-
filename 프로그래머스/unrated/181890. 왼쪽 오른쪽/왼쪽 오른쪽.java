class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                answer = new String[i];
                for(int j = 0; j < i ; j++){
                     answer[j] = str_list[j] ;
                }
                break; 
            }else if(str_list[i].equals("r")){
                int cnt = 0;
                answer = new String[str_list.length - (i + 1)];
                for(int k = i + 1; k < str_list.length ; k++){
                    answer[cnt] = str_list[k];
                    cnt++; 
                }
                break;
            }
        }
        return answer;
    }
}