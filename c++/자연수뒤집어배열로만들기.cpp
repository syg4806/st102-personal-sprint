#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12932
vector<int> solution(long long n) {
    vector<int> answer;
    bool a = true;
    int loc = 10;
    while (a)
    {
        answer.push_back(n % loc);
        n /= loc;

        if (n == 0)
        {
            a = false;
        }
    }

    return answer;
}