#include <string>
#include <vector>

using namespace std;
//https://programmers.co.kr/learn/courses/30/lessons/12937
string solution(int num) {
    string answer = "";
    if (num % 2 == 0) {
        answer = "Even";
    }
    else {
        answer = "Odd";
    }
    return answer;
}