class Solution {
    public String[] solution(String my_str, int n) {
        String str = "";
        int size = my_str.length() / n;
        int nam = my_str.length() % n; 
        
        if(my_str.length() % n != 0){
            size += 1; 
        }
        
        String[] answer = new String[size];
        
        for(int i = 0; i < size ; i++){
            str = "";
            if( i == size - 1 && my_str.length() % n != 0){
                for(int j = 0; j < nam; j++){
                    str += my_str.charAt(j + i * n);
                }
            }else{
               for(int j = 0; j < n; j++){          
                   str += my_str.charAt(j + i * n) ; 
               }
            }
             answer[i] = str;
        }
        return answer;
    }
}