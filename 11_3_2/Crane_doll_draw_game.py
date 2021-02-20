def solution(board, moves):
    answer = 0
    save=[]
    for i in range(0,len(moves)) :
        a = moves[i] -1
        for j in range (0,len(board[0])):
            if board[j][a] >0:
                if not save:
                    save.append(board[j][a])
                    board[j][a] =0
                elif save[-1] == board[j][a]:
                    answer = answer+2
                    save.pop()
                    board[j][a] =0
                else:
                    save.append(board[j][a])
                    board[j][a]=0
                break
    return answer

//https://programmers.co.kr/learn/courses/30/lessons/64061