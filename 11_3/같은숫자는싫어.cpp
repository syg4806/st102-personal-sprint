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
    // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    cout << "Hello Cpp" << endl;

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12906
//���� ���ڰ� ���������θ� ��Ÿ���ϱ� ���� ���ؼ� �߰���