import java.util.Locale;

class Solution {
    public int solution(String myString, String pat) {
        //대문자로 변환할려면 toUpperCase()
        myString = myString.toLowerCase(Locale.ENGLISH);
        pat      = pat.toLowerCase(Locale.ENGLISH);
        
        if(myString.contains(pat)) {
			return 1;
		}
		else {
			return 0;
		}
      
    }
}