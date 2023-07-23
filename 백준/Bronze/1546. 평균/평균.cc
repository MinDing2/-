#include<iostream>
using namespace std;

int main()
{
    int num;
    float maximumValue = 0, sum = 0;
    cin >> num;
    float* grades = new float[num];

    for (int i = 0; i < num; i++)
    {
        cin >> grades[i];
        if (maximumValue <= grades[i])
        {
            maximumValue = grades[i];
        }

    }
    for (int i = 0; i < num; i++)
    {
        grades[i] = (grades[i] / maximumValue) * 100;
        sum += grades[i];
    }

    delete[] grades;

    cout << sum / num;
}