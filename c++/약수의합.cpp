#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12928
int solution(int n) {
    int answer = 0;
    for (int i = 1; i < n + 1; i++)
    {
        if (n % i == 0)
        {
            answer += i;
        }
    }
    return answer;
}