class Solution {
    public String solution(String letter) {
        //String letter
        String answer   = "";
        String[] str    =  letter.split(" ");
        String[] al     = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpa   = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                        "o", "p", "q","r","s","t","u","v","w","x","y","z"}; 
        
        for(int i = 0;i < str.length; i++){
            for(int j = 0; j < al.length; j++){
                if(str[i].equals(al[j])){
                    answer += alpa[j];
                }
            }
        }
        return answer;
    }
}