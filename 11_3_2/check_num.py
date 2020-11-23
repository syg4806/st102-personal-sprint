def solution(s):
    answer = True
    if len(s)!= 4 and len(s)!=6:
        answer = False
    if s.isdigit() == False :
        answer = False
    return answer
//https://programmers.co.kr/learn/courses/30/lessons/12918
//isdigit() 숫자인지 확인하는 함수 알게됨