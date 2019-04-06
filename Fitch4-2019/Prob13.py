def check(arr):
    for i in range(0, len(arr) - 1, 1):
        curr = arr[i]
        nextOne = arr[i + 1]
        valid = False
        for j in str(curr):
            if j in str(nextOne):
                valid = True
        if valid == False:
            return False
    return True

for i in range(3):
    longest = 1
    arr = input().split(", ")
    loop = 2 ** len(arr)
    for j in range(loop):
        currSeq = bin(j)[2:]
        currSeq = ((len(arr) - len(currSeq)) * "0") + currSeq
        tempArr = []
        for h in range(len(currSeq)):
            if currSeq[h] == "1":
                tempArr.append(arr[h])
            if check(tempArr) and len(tempArr) > longest:
                longest = len(tempArr)
    print(longest)
