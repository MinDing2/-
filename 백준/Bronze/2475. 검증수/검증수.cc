#include<iostream>
using namespace std;

int main()
{
  int a,b,c,d,e,sum,result;
  cin >> a >> b >> c >> d >>e;
   
  sum =(a * a)+ (b * b) + (c*c)+(d*d)+(e*e); 
  result = sum % 10;
  cout << result;
}