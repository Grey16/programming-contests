def main():
    for i in range(4):
        arr = list(map(int, input().strip().split(" ")))
        x = str(arr[0])
        print(x[arr[1] - 1 : arr[1]])

if __name__ == "__main__": main()
