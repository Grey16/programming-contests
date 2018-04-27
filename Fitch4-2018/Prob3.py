def main():
    for i in range(4):
        n = int(input())
        arr = list()
        arr.append(0)
        arr.append(1)
        for j in range(1, n + 1):
            if j == 1:
                print("0 ", end = "")
            elif j == 2:
                print("1 ", end = "")
            else:
                temp = arr[0]
                arr[0] = arr[1]
                arr[1] = temp + arr[0]
                print(str(arr[1]) + " ", end = "")
        print()

if __name__ == "__main__": main()
