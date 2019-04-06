for i in range(3):
    inArr = list(map(int, input().split()))
    gcd = 1
    for j in range(min(inArr), 0, -1):
        works = True
        for n in inArr:
            if n % j != 0:
                works = False
        if works == True:
            gcd = j
            break
        else:
            j += 1
    print(gcd)
