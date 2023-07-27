class Solution {
    public int solution(String myString, String pat) {
      
		 myString = myString.replaceAll("B", "C");
		 myString = myString.replaceAll("A", "B");
		 myString = myString.replaceAll("C", "A");
	
		 if(myString.contains(pat)){
			 return 1;
		 }else {
			  return 0;
		 }
    }
}