def main():
    for i in range(4):
        arr = list(map(int, input().strip().split(" ")))
        if arr[0] in arr[1:]:
            print(1)
        else:
            print(0)

if __name__ == "__main__": main()
