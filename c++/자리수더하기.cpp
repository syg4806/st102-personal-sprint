#include <iostream>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12931
int solution(int n)
{
    int answer = 0;
    bool a = true;
    int loc = 10;
    while (a)
    {
        answer += (n % loc);
        n /= loc;

        if (n == 0)
        {
            a = false;
        }
    }


    return answer;
}