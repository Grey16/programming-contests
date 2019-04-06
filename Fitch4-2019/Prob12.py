for i in range(3):
    inArr = input().split("#")
    key = inArr[0]
    answer = ""
    loop = len(inArr[1]) // 6
    for j in range(loop):
        temp = ""
        curr = inArr[1][:6]
        for h in range(6):
            if curr[h] == "1":
                if key[h] == "0":
                    temp += "1"
                else:
                    temp += "0"
            else:
                if key[h] == "0":
                    temp += "0"
                else:
                    temp += "1"
        answer += chr(int(temp, 2) + 96)
        inArr[1] = inArr[1][6:]
    print(answer)
