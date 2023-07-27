import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();

        for (int element : arr) {
            boolean found = false;
            for (int deleteElement : delete_list) {
                if (element == deleteElement) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                answerList.add(element);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}