def solution(s):
    answer = ''
    a=len(s)
    if a%2 == 0 :
        a = a//2
        answer =s[a-1:a+1]
    elif a %2 == 1 :
        a = a//2
        answer =s[a]
        
    return answer
//https://programmers.co.kr/learn/courses/30/lessons/12903
// //연산(나누기 후 소수점 버리기)에 대하여 알아감