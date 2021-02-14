#https://www.acmicpc.net/problem/10825
#람다를 이용해 정렬하는 법을 알게되었따

n = int(input())
array = []

for _ in range(n):
  input_list = list(input().split())
  name = input_list[0]
  g, e, s = int(input_list[1]), int(input_list[2]), int(input_list[3])
  array.append((name, g, e, s))

array.sort(key=lambda x: (-x[1], x[2], -x[3], x[0]))

for student in array:
  print(student[0])
