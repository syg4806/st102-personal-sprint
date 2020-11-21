#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    int month[12] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
    string day[7] = { "FRI","SAT","SUN","MON","TUE","WED","THU" };
    int num = 0;

    for (int i = 0; i < a - 1; i++)
    {
        num += month[i];
    }
    num += b - 1;
    answer = day[num % 7];

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12901
//�迭�� ���� ���� ���� �ϼ� ������ ���� �Ŀ� a�޿��� �ϳ� ���� �� ������ �Ŀ� �������� ���� ���� ����