#include <string>
#include <vector>
#include <cstring>
#include <cctype>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12918
bool solution(string s) {
    bool answer = true;
    if (s.length() != 4 && s.length() != 6)
    {
        answer = false;
    }
    for (int i = 0; i < s.length(); i++)
    {
        if (!isdigit(s[i]))
        {
            answer = false;
            break;
        }
    }
    return answer;
}