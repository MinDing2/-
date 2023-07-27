class Solution {
    public String solution(String n_str) {
        for (int i = 0; i < n_str.length(); i++){
		    if(n_str.charAt(0) == '0'){
                n_str = n_str.replaceFirst("0", "");
                i--; //줄어드는 길이 맞추기 
            }else{
                break;
            }
		}
        return n_str;
    }
}