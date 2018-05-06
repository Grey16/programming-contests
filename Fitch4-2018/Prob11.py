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

        routes = list()
        for r in range(len(matrix)):
            currRow = list()
            for c in range(len(matrix[0])):
                if matrix[r][c] == -1:
                    currRow.append(0)
                else:
                    currRow.append(1)
            routes.append(currRow)

        for row in routes:
            print(row)

if __name__ == "__main__": main()
