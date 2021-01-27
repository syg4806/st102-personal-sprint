#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12921

int solution(int n) {
    int answer = 0;
    vector<int> v;


    for (int i = 2; i < n + 1; i++)
    {
        v.push_back(i);
    }


    for (int j = 0; j < n; j++)
    {
        if (v[j] == 0)
        {
            continue;
        }
        for (int k = j + v[j]; k < n + 1; k += v[j])
        {
            v[k] = 0;
        }
    }

    for (int z = 0; z < v.size(); z++)
    {
        if (v[z] != 0)
        {
            answer++;
        }
    }
    return answer;
}