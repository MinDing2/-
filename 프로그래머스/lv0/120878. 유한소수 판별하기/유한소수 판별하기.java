import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        boolean tr = true; 
        List<Integer> aKey = new ArrayList<>();
        List<Integer> bKey = new ArrayList<>(); 
        List<Integer> aNum = new ArrayList<>();
        List<Integer> bNum = new ArrayList<>();
        
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
             if(i * j  == a){
                aNum.add(i);
                aKey.add(j);
             }
           }
        }
        
         for(int i = 1; i <= b; i++){
             for(int j = 1; j <= b; j++){
              if(i * j  == b){
                 bNum.add(i);
                 bKey.add(j);
              }
           }
        }
        
        for(int i = 0; i < aKey.size(); i++){
            for(int j = 0; j < bKey.size(); j++){
                if(aKey.get(i) == bKey.get(j) && tr){
                   a = aNum.get(i);
                   b = bNum.get(j);
                   tr = false;
                }
            }
        }
        if(b == 1){
            return 1; 
        }
        
        String str = ""; 
        int cnt = 0;
        tr = true;
        
        for(int i = 2; i <= b; i++){
            while(b % i == 0){
               if(tr){
                    str += String.valueOf(i) + " ";
                    tr = false; 
                    cnt++;
                }
                b = b / i;
            }
            tr = true; 
        }

    int[] ary = new int[cnt];
    String[] st = str.split(" ");
        
    for(int i = 0; i < cnt; i++){
        ary[i] = Integer.parseInt(st[i]);
    }
        
    for(int i = 0; i < cnt; i++){
        if(ary[i] == 2 || ary[i] == 5){
            answer = 1;
        } else{
            answer = 2;
            return answer;
        }
    } 
        
    return answer;  
    }
}