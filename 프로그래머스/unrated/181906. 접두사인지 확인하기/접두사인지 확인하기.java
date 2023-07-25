class Solution {
    public int solution(String my_string, String is_prefix) {
   
       String answer = "";
		char[] a = new char[my_string.length()];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = my_string.charAt(i);
			answer += a[i]; 
			if(is_prefix.equals(answer)) {
                return 1;
			}			
		}
        return 0;
        
    }
}