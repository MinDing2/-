class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
            
        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){  
                answer = "login";   //id가 pw가 db랑 같으면
            }else if(id_pw[0].equals(db[i][0])){      
                answer = "wrong pw";   //id만 같으면
            }
        }
        
        return answer;
    }
}