def main():
    for i in range(4):
        arr = list(map(int, input().strip().split(" ")))
        a = arr[0]
        b = arr[1]
        while a != b:
            if a < b:
                temp = b
                b = a
                a = temp
            a -= b
        print(a)

if __name__ == "__main__": main()
