#include <string>
#include <iostream>
#include <cstring>
using namespace std;

bool solution(string s)
{
    bool answer = true;

    // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    cout << "Hello Cpp" << endl;
    int num_p = 0;
    int num_y = 0;

    char* cstyle = new char[s.size() + 1];

    // cppstyle�� ���ڿ��� �� �����Ѵ�.
    strcpy(cstyle, s.c_str());

    for (int i = 0; i < s.size(); i++)
    {
        if (cstyle[i] == 'p' | cstyle[i] == 'P')
        {
            num_p++;
        }
        if (cstyle[i] == 'y' | cstyle[i] == 'Y')
        {
            num_y++;
        }
    }
    if (num_y != num_p)
        answer = false;
    if (num_y == 0 | num_p == 0)
        answer = false;
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12916
//���ڿ��� �迭�� �����ϰ� ���������� �˻��� �� ������ ���� 1�� �÷��ش�