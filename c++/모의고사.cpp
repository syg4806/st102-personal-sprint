#include <string>
#include <vector>
#include <algorithm>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/42840

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    vector<int> answer_two = { 2,1,2,3,2,4,2,5 };
    vector<int> answer_three = { 3,3,1,1,2,2,4,4,5,5 };
    int one = 0;
    int two = 0;
    int three = 0;

    for (int i = 0; i < answers.size(); i++)
    {
        if (answers[i] == i % 5 + 1)
        {
            one++;
        }
    }
    for (int j = 0; j < answers.size(); j++)
    {
        if (answers[j] == answer_two[j % 8])
        {
            two++;
        }
    }

    for (int k = 0; k < answers.size(); k++)
    {
        if (answers[k] == answer_three[k % 10])
        {
            three++;
        }
    }

    if (one > two)
    {
        answer.push_back(1);
    }
    else if (one == two)
    {
        answer.push_back(1);
        answer.push_back(2);
    }
    else
    {
        answer.push_back(2);
    }

    if (three > one && three > two)
    {
        answer.clear();
        answer.push_back(3);
    }
    else if (answer[0] == 1)
    {
        if (three == one)
        {
            answer.push_back(3);
        }
    }

    else if (answer[0] == 2)
    {
        if (three == two)
        {
            answer.push_back(3);
        }
    }


    sort(answer.begin(), answer.end());
    return answer;
}