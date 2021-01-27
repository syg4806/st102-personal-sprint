#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/42862

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    answer = n - lost.size();

    for (int i = 0; i < lost.size(); i++)
    {
        for (int j = 0; j < reserve.size(); j++)
        {
            if (lost[i] == reserve[j])
            {
                lost.erase(lost.begin() + i--);
                reserve.erase(reserve.begin() + j--);
                answer++;
            }
        }
    }


    for (int i = 0; i < lost.size(); i++)
    {
        for (int j = 0; j < reserve.size(); j++)
        {
            if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j])
            {
                lost.erase(lost.begin() + i--);
                reserve.erase(reserve.begin() + j--);
                answer++;
            }
        }
    }

    return answer;
}