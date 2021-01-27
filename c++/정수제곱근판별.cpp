#include <string>
#include <vector>
#include <cmath>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12934
long long solution(long long n) {
    long long answer = 0;
    //if (num/1.00 == (int)num)
    if (sqrt(n) - (int)sqrt(n) == 0)
    {
        answer = pow(sqrt(n) + 1, 2);
    }
    else
        answer = -1;
    return answer;
}