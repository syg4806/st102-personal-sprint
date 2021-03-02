#https://programmers.co.kr/learn/courses/30/lessons/64061
#2차원 배열 접근해서 쭉들어가서 0만들고 그 수를 cur에 넣고 비교해서 같으면 answer++ 하는 식으로 생각 중. 바구니를 굳이 만들필요있나? 그냥 변수 2개로 돌려가면서 하면 될 것 같다
#라고 생각했는데 아니었군! 터지고 남은거끼리 터지는 걸 생각안했따! 바보다!
#첨에 break를 빼먹고 엄청 헤메었다 ㅎㅎ 자살마려워!

def solution(board, moves):
    answer = 0
    size = len(board)
    array = []
    
    for move in moves:
        for i in range(size):
            if board[i][move-1] != 0:
                array.append(board[i][move-1])
                board[i][move-1] = 0
                
                if array[-1:] == array[-2:-1]:
                    array.pop(-1)
                    array.pop(-1)
                    answer += 1
                break

    return answer*2
