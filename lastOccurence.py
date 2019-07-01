n, x = input().split()
a = list(map(int, input().split()))
for i in range(int(n)-1,-1,-1):
    if int(x) == a[i]:
        print(i+1)
        break
if i==-1:
    print(-1)