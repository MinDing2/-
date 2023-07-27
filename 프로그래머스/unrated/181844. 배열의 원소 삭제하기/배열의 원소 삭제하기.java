import java.util.*;
import java.math.*;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
		int kCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {		//삭제할 원소랑 같아 
                    kCnt++;	  
				}
			}
		}
        
        //할당
        int[] answer;
        if(arr.length  - kCnt > 0){
		    answer = new int[arr.length  - kCnt];   
        }else{
            answer = new int[0];
        }
		int[] key;
		if(kCnt > 0) {
			key= new int[kCnt];
		}else {
			key = new int[0];
		}
        
		int cnt = 0;
        
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {
					key[cnt] = i;
					cnt++;
				}
			}
		}
		
		cnt = 0;
		int cnt1 = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
    if (key.length < 1) {
        answer[i] = arr[i];
    } else if (cnt1 < key.length && key[cnt1] == i) {
        cnt1++;
    } else {
        answer[cnt++] = arr[i];
    }
}

        return answer;
    }
}