fibList = [0, 1]
for i in range(3):
    n = int(input())
    while fibList[-1] <= n:
        fibList.append(fibList[-1] + fibList[-2])
    ind = fibList.index(n)
    print(fibList[ind - 1], fibList[ind + 1])
