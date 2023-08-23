import java.util.*; 
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> num = new ArrayList<>();
        String str   = "";
        String rL    = "";
        
        for(int i = l; i <= r; i++){
            rL = String.valueOf(i);
            for(int j = 0; j < rL.length(); j++){
                 if(rL.charAt(j) == '0' || rL.charAt(j) == '5'){
                     str += rL.charAt(j);
                 }else{
                     str =""; 
                     break;
                 }
            }
            if(str != ""){
                num.add(Integer.parseInt(str));
            }
            str = ""; 
        }
        
        if(num.size() == 0){
            num.add(-1);
        }
        
        int[] answer = new int[num.size()];
        
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        
        return answer;
    }
}