import java.util.*; 
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer   = 2;
        int[] cnt    = new int[dic.length]; 
        
        Arrays.fill(cnt, 0);
         
        boolean tr = true;
        
        for(int i = 0; i < spell.length; i++){
            for(int j = 0; j < dic.length; j++){
                if(dic[j].contains(spell[i])){
                    cnt[j] += 1;
                }
                if(cnt[j] == dic[j].length() && spell.length <= dic[j].length()){
                    answer = 1;
                }
            }                             
        }
          
        
        return answer;
    }
}