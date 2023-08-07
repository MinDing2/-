#include<iostream>
using namespace std;

int main()
{
  int input, compare, num;
    
  cin >> input >> compare;
  for(int i = 0; i <input; i++)
  {
      cin >> num;
      if(num < compare)
      cout << num << " ";
  }
}