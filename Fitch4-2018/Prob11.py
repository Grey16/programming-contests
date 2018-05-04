def main():
    for i in range(1):
        arr = list(map(int, input().strip().split(" ")))
        dep = arr[0]
        dest = arr[1]
        matrix = list()
        s = input()
        while s != "":
            matrix.append(list(map(int, s.strip().split(" "))))
            s = input()

        for row in matrix:
                print(row)

if __name__ == "__main__": main()
