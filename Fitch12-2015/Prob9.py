def main():
    for i in range(4):
        printed = False
        matrix = [[0] * 9 for i in range(9)]
        for i in range(9):
            matrix[i] = list(input())
        for i in range(9):
            temp = [0 for i in range(9)]
            for j in range(9):
                cell = matrix[i][j]
                if int(cell) != 0:
                    temp[int(cell) - 1] += 1
                    if temp[int(cell) - 1] > 1:
                        if not printed:
                            print("Duplicate entries of " + str(int(cell)) + " in row " + str(i + 1) + "; not valid")
                            printed = True
                        break
        if not printed:
            for i in range(9):
                temp = [0 for i in range(9)]
                for j in range(9):
                    cell = int(matrix[j][i])
                    if int(cell) != 0:
                        temp[cell - 1] += 1
                        if temp[cell - 1] > 1:
                            if not printed:
                                print("Duplicate entries of " + str(cell) + " in column " + str(i + 1) + "; not valid")
                                printed = True
                            break

        rowBase = 0
        colBase = 0
        if not printed:
            for i in range(9):
                temp = [0 for i in range(9)]
                for j in range(3):
                    rowCoord = rowBase + j
                    for k in range(3):
                        colCoord = colBase + k
                        cell = int(matrix[rowCoord][colCoord])
                        #print(str(rowCoord) + ", " + str(colCoord))
                        if cell != 0:
                            temp[cell - 1] += 1
                            if temp[cell - 1] > 1:
                                if not printed:
                                    print("Duplicate entries of " + str(cell) + " in 3*3 grid " + str(i + 1) + "; not valid")
                                    printed = True
                                break
                if (i + 1) % 3 == 0:
                    rowBase += 3
                if colBase != 6:
                    colBase += 3
                else:
                    colBase = 0
        if not printed:
            print("Given sudoku grid is valid")


if __name__ == "__main__": main()

# 127396458
# 643785912
# 985412673
# 239641587
# 864527139
# 571938246
# 318264795
# 452879361
# 796153824

# 127396458
# 643785912
# 985412673
# 239641587
# 867524139
# 571938246
# 318264795
# 452879361
# 796153824

# 127396458
# 643785910
# 985413672
# 239641587
# 864527139
# 571938246
# 318260795
# 452879361
# 796150824

# 127396458
# 642785912
# 985412673
# 239641587
# 864527139
# 571938246
# 318264795
# 452879361
# 796153824
