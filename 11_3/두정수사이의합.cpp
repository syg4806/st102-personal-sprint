#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    if (a == b)
        answer = a;
    else if (a > b) {
        for (int i = b; i < a + 1; i++)
        {
            answer += i;
        }
    }
    else if (b > a) {
        for (int i = a; i < b + 1; i++)
        {
            answer += i;
        }
    }
    return answer;
}

//https://programmers.co.kr/learn/courses/30/lessons/12912
//범위에 따라 더하는 수의 시작점을 달리함