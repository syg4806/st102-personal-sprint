#https://www.acmicpc.net/problem/9012
#괄호! 스택이댜

n = int(input())

def my_check(input_val):
  stack = []
  for i in input_val:
    if i == "(":
      stack.append(i)
    else: # i == ")"
      if not stack: #없으면 ㄴㄴ지!
        print("NO") 
        return
      else:
        stack.pop()

  if not stack: #안남아있으면
    print("YES") # ㅇㅇ
    return
  else: #남아잇으면 ㄴㄴ지
    print("NO")
    return


for _ in range(n):
  my_check(input())


      
    