class Solution {
    public String solution(String str1, String str2) {
       		char[] a =new char[str1.length()];
		char[] b =new char[str2.length()];
		
		for (int i = 0; i < b.length; i++) {
			a[i]	= str1.charAt(i);
			b[i]	= str2.charAt(i);
		}
		int numLength = str1.length() + str2.length();
		
		String answer = "";
		
		int aCnt = 0;
		int bCnt = 0;
		
		for (int i = 0; i < numLength; i++) {
			if(i % 2 == 0) {
				answer += a[aCnt];
                aCnt++;
			}else {
				answer += b[bCnt];
                bCnt++;
			}
		}
		
		return answer; 
    }
}