def main():
    for i in range(4):
        target = int(input())
        arr = list(map(int, input().strip().split(" ")))
        arr.sort(reverse = True)
        while True:
            if len(arr) > 0 and arr[0] > target:
                arr = arr[1:]
            else:
                break
        arr.sort()
        temp = list()
        found = False
        for j in range(len(arr)):
            result = comb(arr, j, target, temp)
            if result != False:
                found = True
                print("yes (", end = "")
                for k in range(len(result)):
                    print(str(result[k]), end = "")
                    if k == len(result) - 1:
                        print(")")
                    else:
                        print(" ", end = "")
        if not found:
            print("no")

def comb(arr, n, target, temp):
    if len(temp) == n:
        if sum(temp) == target:
            return temp
        else:
            return False
    for i in range(len(arr) - n + len(temp) + 1):
        temp.append(arr[i])
        result = comb(arr[i + 1:], n, target, temp)
        if result == False:
            temp.pop()
        else:
            return result
    return False


if __name__ == "__main__": main()
