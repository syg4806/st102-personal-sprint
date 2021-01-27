#include <string>
#include <vector>
#include <algorithm>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12933
long long solution(long long n) {
    long long answer = 0;
    vector<int> num;
    bool a = true;
    int loc = 10;
    while (a)
    {
        num.push_back(n % loc);
        n /= loc;

        if (n == 0)
        {
            a = false;
        }
    }
    sort(num.begin(), num.end());

    int multi = 1;
    for (int i = 0; i < num.size(); i++)
    {
        answer += num[i] * multi;
        multi *= 10;
    }
    return answer;
}