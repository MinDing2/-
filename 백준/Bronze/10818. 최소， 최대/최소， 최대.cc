#include<iostream>
using namespace std;

int main()
{
    int a;
    int min= 0, max= 0;
    cin >> a;
    int *array = new int[a];
    
    for(int i = 0; i < a; i++)
    {
        cin >> array[i];
    }
    min = array[0];
    max = array[0];
    for(int i = 0; i < a; i++)
    {
        if(max < array[i])
            max = array[i];
        
       if(min > array[i])
            min = array[i];               
    }
    
    cout << min <<" "<< max << endl;
    
    
    return 0;
}
