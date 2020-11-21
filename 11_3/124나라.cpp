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
// 1인 경우 124에서 1 3으로 나누면 나머지 1, 2인 경우 124에서 2 나머지 2, 3인 경우 124에서 4 나머지 0
// 기존의 3진법에서 한칸이 밀린걸 확인 할 수 있다
// 그러므로 3진법으로 변환하는 과정이랑 같지만 1을 매번 빼줘야 나머지 연산을 할 경우에 알맞은 나머지가 나오고 1,2,4중 추가 해줄 수 있다
//"124"[a] 이 경우에는 배열에서 a 인덱스를 뜻한다