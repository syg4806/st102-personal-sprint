#include <string>
#include <vector>

using namespace std;
// �ִ����� =  �������� ��� ����
//�ּҰ���� = �μ� �� = �ִ����� * �ּҰ����
vector<int> solution(int n, int m) {
    vector<int> answer;
    int a, b;

    if (n > m) {
        a = m;
        b = n;
    }
    else {
        a = n;
        b = m;
    }
    int t = a * b;
    while (a > 0)
    {
        int num = a;
        a = b % a;
        b = num;
    }
    answer.push_back(b);
    t = t / b;
    answer.push_back(t);
    return answer;
}