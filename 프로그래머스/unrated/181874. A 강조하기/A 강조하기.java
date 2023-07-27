class Solution {
    public String solution(String myString) {
		String answer ="";
		
		for (int i = 0; i < myString.length(); i++) {
				 if('a' == myString.charAt(i)) {
					answer +="A";
				 }else if( 65 < myString.charAt(i)  &&  myString.charAt(i) < 97 ) { // 대문자 ->소문자
					 answer += (char)(myString.charAt(i) + 32);   
				 }else {
					 answer += myString.charAt(i);
				 }
		}
		 return answer;	
    }
}