#include <iostream>
#include <sstream>
#include <vector>
#include <math.h>

using namespace std;

string solution(int n) {
    string answer = "";
    int a;
    while (n > 0) {
        n -= 1;
        a = n % 3;
        n = n / 3;

        answer = "124"[a] + answer;
    }
    cout << answer << endl;

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12899
// 1�� ��� 124���� 1 3���� ������ ������ 1, 2�� ��� 124���� 2 ������ 2, 3�� ��� 124���� 4 ������ 0
// ������ 3�������� ��ĭ�� �и��� Ȯ�� �� �� �ִ�
// �׷��Ƿ� 3�������� ��ȯ�ϴ� �����̶� ������ 1�� �Ź� ����� ������ ������ �� ��쿡 �˸��� �������� ������ 1,2,4�� �߰� ���� �� �ִ�
//"124"[a] �� ��쿡�� �迭���� a �ε����� ���Ѵ�