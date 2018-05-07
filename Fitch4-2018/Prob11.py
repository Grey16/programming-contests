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

        routes = list()
        for r in range(len(matrix)):
            currRow = list()
            for c in range(len(matrix[0])):
                if matrix[r][c] == -1 or matrix[r][c] == 0:
                    currRow.append(0)
                else:
                    currRow.append(1)
            routes.append(currRow)

        printed = False
        if dep == dest:
            print("0 (" + str(dep) + " " + str(dest) + ")")
            printed = True
        else:
            currRoute = [x[:] for x in routes]
            for j in range(len(routes) - 1):
                currRoute = multMatrices(routes, currRoute)
                if currRoute[dep - 1][dest - 1] == 1:
                    print("There is a path")
                    printed = True
                    break
        if printed == False:
            print(-1)

def findAllPaths(matrix, dep, dest):
    visited = [False] * len(matrix)
    paths = list()

def multMatrices(mat1, mat2):
    output = list()
    for i in range(len(mat1)):
        currRow = [0] * len(mat1)
        output.append(currRow)
    for r in range(len(mat1)):
        for c in range(len(mat1)):
            total = 0
            for i in range(len(mat1)):
                total += mat1[r][i] * mat2[i][c]
            output[r][c] = total

    return output

if __name__ == "__main__": main()

# 2 3
# 0 -1 50 8 -1
# 20 0 80 -1 -1
# -1 -1 0 -1 -1
# -1 -1 5 0 1
# -1 90 1 40 0

# 3 1
# 0 -1 50 8 -1
# 20 0 80 -1 -1
# -1 -1 0 -1 -1
# -1 -1 5 0 1
# -1 90 1 40 0

# 1 2
# 0 50 10
# 50 0 20
# 20 10 0

# 2 2
# 0 50 10
# 50 0 20
# 20 10 0
