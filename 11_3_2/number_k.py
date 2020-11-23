def solution(array, commands):
    answer = []
    for i  in range(0,len(commands)):
        num = []
        a = commands[i][0]
        b = commands[i][1]
        if a == b :
            num.append(array[a-1])
        else :
            for j in range(a-1,b):
                num.append(array[j])
                num.sort()
        answer.append(num[commands[i][2]-1])
    
    return answer

//https://programmers.co.kr/learn/courses/30/lessons/42748
//