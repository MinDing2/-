class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr   = {a, b, c, d};
        int[] copy  = {0, 0, 0, 0}; 
        int[] check = {0, 0, 0, 0}; 
        int answer = 1, cnt = 0, one = 0, two = 0, three = 0;
        boolean fs = false;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j != i && arr[i] == arr[j]){
                    copy[i]++; 
                }
            }
        }             
        for(int i = 0; i < 4; i++){
            if(copy[i] == 3){
                check[3] += 1;
            }else if(copy[i] == 2){
                check[2] += 1;
            }else if(copy[i] == 1){
                check[1] += 1;
            }else if(copy[i] == 0){
                check[0] += 1;
            }
        }
        if(check[3]  == 4){
           answer = 1111 * arr[0];
        } 
        if(check[0] == 4){
            int min = arr[0];
            for(int i = 0; i < 4; i++){
                if(min > arr[i]){
                    min    = arr[i];
                    answer = arr[i];
                }
            }
        }
        if(check[2] == 3 && check[0] == 1){
            one = arr[0];
            for(int i = 1; i < 4; i++){
                if(one == arr[i]){
                    three = one;
                    fs    = true;
                }
            }  
            if(fs){// 같은게 있어 
                for(int i = 0; i < 4; i++){
                    if(three != arr[i]){
                        one = arr[i];
                    }
                }
            }else{
                three = arr[1];
            }
            answer =(10 * three + one) * (10 * three+one);
        }   
         if(check[1] == 4){
                two = arr[0];
             for(int i = 1; i < 4; i++){
                if(two != arr[i]){
                    answer =  two - arr[i];
                    if(answer < 0){
                        answer = -answer;
                    }
                    answer *= two + arr[i];
                }
            }
         }
         if(check[1] == 2 && check[0] == 2){
             for(int i = 0; i < 4; i++){
                 for(int j = 0; j < 4; j++){
                     if(i !=j && arr[i] == arr[j]){
                        one = arr[i];
                     }
                 }
             }
             for(int i =0; i < 4; i++){
                 if(one != arr[i]){
                     answer *= arr[i]; 
                 }
             }
        }
        return answer;
    }
}