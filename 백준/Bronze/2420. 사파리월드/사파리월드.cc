#include<iostream>
using namespace std;

int main()
{  
  long long a, b, c;
  cin >> a >> b;
  c = a - b;
    
  if(c < 0)
  {
     c = -c;
     cout << c;
  }
    
  else
  {
    cout << c;
  }   
    
}