#include <string>
#include <vector>

#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> v;

    while (n)
    {
        v.push_back(n % 3);
        n /= 3;
    }

    reverse(v.begin(), v.end());

    for (int i = 0; i < v.size(); i++)
        answer += pow(3, i) * v[i];

    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/68935
//���� ������������ ���� ���Ϳ� �ְ� �Ŀ� �ڰ� �ٽ� n�����ؼ� 10�������� ��ȯ