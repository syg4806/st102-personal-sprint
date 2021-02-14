#https://programmers.co.kr/learn/courses/30/lessons/12982
#당연히 부서별 신청 금액이 낮은거끼리 빌딩한 개수가 최대 개수겠지?
def solution(d, budget):
    answer = 0
    d.sort() #정렬
    
    for i in d:
        if budget - i < 0:
            break
        else:
            budget -= i
            answer += 1
    
    return answer