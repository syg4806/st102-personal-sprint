#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    answer.push_back(arr[0]);
    for (int i = 1; i < arr.size(); i++)
    {
        if (arr[i - 1] != arr[i]) {
            answer.push_back(arr[i]);
        }
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    cout << "Hello Cpp" << endl;

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12906
//같은 숫자가 연속적으로만 나타나니깐 전과 비교해서 추가함