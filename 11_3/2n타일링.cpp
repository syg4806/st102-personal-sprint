#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int a = 1;
    int b = 2;
    int c = 3;
    if (n < 4)
    {
        answer = n;
    }
    else
    {
        for (int i = 0; i < n - 2; i++)
        {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
    }

    answer = c;
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12900
//�Ǻ���ġ ���� �ľ��� �� �������� ����� �ƴ� ���ɼ��� �߸� �̿�
//����-ó������ ���� Ÿ���� ���� ���� �ΰ��� ����ε� �� �� ó���� �����ϰ� ���� ���̰� 1 ���̰� ����