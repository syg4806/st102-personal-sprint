#include <string>
#include <vector>
#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    char* cstyle = new char[s.size() + 1];
    strcpy(cstyle, s.c_str());
    sort(cstyle, cstyle + (s.size() + 1));

    for (int i = s.size(); i > 0; i--)
    {
        answer.push_back(cstyle[i]);
    }
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12917
//���ڿ� ���� �Ŀ� �����ϰ� �Ųٷ� ���
//������ �̿뵵 ����