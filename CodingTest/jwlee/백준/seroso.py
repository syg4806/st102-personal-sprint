#서로소 집합 알고리즘!

#특정 원소가 속한 집합 부모 찾아올라가기(재귀)
def find_parent(parent, x):
  if parent[x] != x:
    return find_parent(parent, parent[x])
  return x

#두 원소가 속한 집합 합치기 연산
def union_parent(parent, a, b):
  ap = find_parent(parent, a)
  bp = find_parent(parent, b)

  if ap > bp: #a부모가 b부모보다 크면
    parent[a] = bp #a가 b부모 아래에 들어가야지
  else: #바이스벌사
    parent[b] = ap 
  
  
#노드 개수와 간선 개수 입력받기
v, e = map(int, input().split())

#부모 테이블
parent = [0] * (v+1)

#부모 테이블에서 부모를 맨첨에 자기 자신으로 초기화 
for i in range(1, v+1):
  parent[i] = i

for j in range(e):
  a, b = map(int, input().split())
  union_parent(parent, a, b)


print('각 원소가 속한 집합 : ', end=' ')
for i in range(1, v+1):
  print(find_parent(parent, i), end=' ')

print()

print('부모 테이블', end=' ')
for j in range(1, v+1):
  print(parent[j], end=' ')
