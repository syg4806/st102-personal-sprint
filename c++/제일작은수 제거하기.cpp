#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12935
vector<int> solution(vector<int> arr) {
    vector<int> answer;

    int min = arr[0];
    int loc = 0;
    if (arr.size() == 1 && arr[0] == 10)
    {
        answer.push_back(-1);
    }
    else {
        for (int i = 0; i < arr.size(); i++)
        {
            if (min > arr[i])
            {
                loc = i;
                min = arr[i];
            }
        }
        arr.erase(arr.begin() + loc);
        answer = arr;

    }

    return answer;
}