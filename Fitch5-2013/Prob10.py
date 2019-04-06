def main():
    fibList = [1, 1]
    for i in range(3):
        n = int(input())
        while n > fibList[0]:
            temp = fibList[0] + fibList[1]
            fibList.insert(0, temp)
        j = 0
        while True:
            binary = bin(j)[2:]
            temp = 0
            for h in range(len(binary)):
                if int(binary[h]) == 1:
                    index = h - len(binary)
                    temp += fibList[index]
            if temp == n:
                print(binary)
                break
            j += 1

main()
