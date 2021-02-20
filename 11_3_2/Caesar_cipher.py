def solution(s, n):
    answer = ''
    abc = list(s)
    for i in range(len(abc)):
        if abc[i].isalpha():
            if abc[i].isupper():
                abc[i] = chr((ord(abc[i])-ord('A') +n)%26 +ord('A') )
            if abc[i].islower():
                abc[i] = chr((ord(abc[i])-ord('a') +n)%26 +ord('a') )
    answer=''.join(abc)
    return answer

//https://programmers.co.kr/learn/courses/30/lessons/12926
//isalpha(),isupper(),islower()을 알게됨