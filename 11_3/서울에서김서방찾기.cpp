#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";
    int num = 0;
    for (int i = 0; i < seoul.size(); i++)
    {
        if (seoul[i] == "Kim") {
            num = i;
            break;
        }
    }
    string str1 = to_string(num);

    answer = "�輭���� " + str1 + "�� �ִ�";
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12919
//�迭���� Kim�� ã�� answer�� ��� ���� ����ȯ ����