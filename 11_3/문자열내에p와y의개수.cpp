#include <string>
#include <iostream>
#include <cstring>
using namespace std;

bool solution(string s)
{
    bool answer = true;

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    cout << "Hello Cpp" << endl;
    int num_p = 0;
    int num_y = 0;

    char* cstyle = new char[s.size() + 1];

    // cppstyle의 문자열을 얻어서 복사한다.
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
//문자열을 배열에 복사하고 순차적으로 검사해 두 변수의 수를 1씩 늘려준다