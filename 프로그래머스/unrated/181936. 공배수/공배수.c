#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int number, int n, int m) {
    //정수 number와 n,m 
    //number가 n의 배수이면서 m의 배수이면 
    //1을 아니라면 0을 return 하도록 
    
    if(number % n == 0 && number % m == 0)
    {
        return 1;
    }
    else{
        return 0;
    }
}