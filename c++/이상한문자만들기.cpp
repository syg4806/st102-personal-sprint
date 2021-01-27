#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12930
string solution(string s) {
    string answer = "";
    int num = 0;
    for (int i = 0; i < s.length(); i++)
    {
        if (isupper(s[i]) || islower(s[i]))
        {
            if (num % 2 == 0)
            {
                s[i] = toupper(s[i]);
                num++;
            }
            else
            {
                s[i] = tolower(s[i]);
                num++;
            }
        }
        else
            num = 0;

    }
    answer = s;
    return answer;
}