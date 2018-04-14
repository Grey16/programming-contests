def main():
    for i in range(4):
        arr = list(map(int, input().strip().split(" ")))
        b = arr[0]
        s = arr[1]
        if s % (b - 1) != 0:
            print(base(s % (b - 1)), end = "")
        c = base(b - 1)
        for j in range(int(int(s) / int(b - 1))):
            print(c, end = "")
        print("")

def base(n):
    if n < 10:
        return str(n)
    else:
        return str(chr(n + 55))

if __name__ == "__main__": main()
