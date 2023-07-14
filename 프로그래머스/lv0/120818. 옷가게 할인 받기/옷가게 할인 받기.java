class Solution {
    public int solution( int price) {
        //10만원 이상 5%
        //30만원 이상 10%
        //50만원 이상 20%
        //price 
        
        //소수점 이하를 버린 정수를 return합니다.
        if(price >= 500000)
        {
            price *= 0.8;
            return price;
        }
        else if(price >= 300000)
        {
            price *= 0.9; 
            return price;
        }
        else if (price >= 100000)
        {
            price *= 0.95; 
            return price;
        }   
        else
        {
            return price;
        }
    }
}