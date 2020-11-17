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

    answer = "김서방은 " + str1 + "에 있다";
    return answer;
}
//https://programmers.co.kr/learn/courses/30/lessons/12919
//배열에서 Kim을 찾고 answer에 담기 위해 형변환 실행