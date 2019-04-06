def main():
    MEAN = (1 + (5 ** 0.5)) / 2
    for i in range(3):
        n = int(input())

        ratio = -1
        lastFactor = -1
        printed = False
        for j in range(int(n ** 0.5), 0, -1):
            if n % j == 0:
                if ratio == -1:
                    ratio = (n / j) / j
                    lastFactor = j
                else:
                    tempRatio = (n / j) / j
                    if abs(tempRatio - MEAN) < abs(ratio - MEAN):
                        ratio = tempRatio
                        lastFactor = j
                    else:
                        print(lastFactor, int(n / lastFactor))
                        printed = True
                        break
        if printed == False:
            print(lastFactor, int(n / lastFactor))

main()
