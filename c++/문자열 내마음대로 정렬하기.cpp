#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12915
vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;

    vector<string> sub;
    string upper = "";
    string lower = "";

    for (int i = 0; i < strings.size(); i++)
    {
        sub.push_back(strings[i]);
    }

    for (int i = 0; i < sub.size(); i++)
    {
        upper = sub[i];
        for (int j = i + 1; j < sub.size(); j++)
        {
            if (sub[j][n] < upper[n])
            {
                lower = upper;
                upper = sub[j];
                sub[j] = lower;
            }
            else if (sub[j][n] > upper[n])
            {
                continue;
            }
            else
            {
                if (sub[j] > upper)
                {
                    continue;
                }
                else
                {
                    lower = upper;
                    upper = sub[j];
                    sub[j] = lower;
                }
            }
        }
        answer.push_back(upper);
    }

    return answer;
}