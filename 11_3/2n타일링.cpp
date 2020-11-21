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
//피보나치 수열 파악할 때 정석적인 방법이 아닌 수능수학 야매 이용
//정석-처음으로 오는 타일이 가로 세로 두가지 경우인데 그 때 처음을 제외하고 가로 길이가 1 차이가 난다