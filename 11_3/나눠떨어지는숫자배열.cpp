#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;
    int a = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        if (arr[i] % divisor == 0)
        {
            answer.push_back(arr[i]);
            a++;
        }
    }
    if (a < 1)
    {
        answer.push_back(-1);
    }
    sort(answer.begin(), answer.end());
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12910
//나눠떨어지면 배열에 추가 하지만 아에 없는 경우를 생각에 변수 에이를 이용