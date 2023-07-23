#include<iostream>
using namespace std;
void star(int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << "*";
    }
}
void space(int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << " ";
    }
}

int main()
{
    int n;
    cin >> n;
    
    for(int i = 1; i <= n; i++)
    {
        space(n - i); 
        star(i);
        cout << "\n";
    }
    
}