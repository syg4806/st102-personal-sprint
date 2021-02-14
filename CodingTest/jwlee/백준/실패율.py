#https://programmers.co.kr/learn/courses/30/lessons/42889
#계수정렬이랑 똑같은 문제인거 같다! 고 생각했는데 그렇게 푸니까 넘 돌아가길래.. 딕셔너리나 튜플 쓸데가 많으니 잘 알아둬야지

def solution(N, stages):
    answer = []
    array = [] #튜플을 넣을 리스트
    sum = len(stages)

    for i in range(1, N+1):
        count = stages.count(i) #스테이지 몇에서 멈춘건지 세고

	  fail = 0 if count == 0 else count / sum #실패율 계산해서
        array.append((i, fail)) #튜플에 넣는다
        sum -= count  #현재 스테이지 탈락자 빼고

    array.sort(key=lambda x: x[1],reverse=True) #실패율으로 정렬

    for j in array:
        answer.append(j[0]) #넘버 출력
    return answer
