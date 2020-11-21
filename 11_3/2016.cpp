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
//배열에 먼저 각각 달의 일수 요일을 담은 후에 a달에서 하날 빼고 다 더해준 후에 나머지를 통해 요일 도출