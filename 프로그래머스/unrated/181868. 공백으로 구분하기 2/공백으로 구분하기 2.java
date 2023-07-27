class Solution {
    public String[] solution(String my_string) {

		String[] answer = my_string.split(" ");

		int cnt = 0;
		
		 for (int i = 0; i < answer.length; i++) {
			if(answer[i].matches("[a-z]+")) {
				cnt++;
			}
		}
		 
		String[]answer1 = new String[cnt];
		 
		 cnt =0;
		 for (int i = 0; i < answer.length; i++) {
			 if(answer[i].matches("[a-z]+")) {
				 	answer1[cnt] = answer[i]; 
					System.out.println(answer1[cnt]);
				 	cnt++;
				}
		}
        
		 return answer1;
    }
}