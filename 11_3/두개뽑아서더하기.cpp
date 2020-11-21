#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    for (int i = 0; i < numbers.size(); i++)
    {
        for (int j = i + 1; j < numbers.size(); j++)
        {
            int k = numbers[i] + numbers[j];
            answer.push_back(k);
        }
    }

    sort(answer.begin(), answer.end());
    answer.erase(unique(answer.begin(), answer.end()), answer.end());

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/68644
//이중for문을 통해 모두 한번씩 더하기 연한을 하고 오름차순으로 정렬후에 중복을 지워줌