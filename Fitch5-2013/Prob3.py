def main():
    for i in range(3):
        inArr = input().split(" ")
        for j in range(len(inArr)):
            inArr[j] = int(inArr[j])
        C = inArr[0]
        n = inArr[1]
        W = inArr[2]
        L = inArr[3]
        answer1 = L // C
        answer2 = int(L // ((((n * W) ** 2) + (C ** 2)) ** 0.5))
        print(answer2, answer1)

main()
