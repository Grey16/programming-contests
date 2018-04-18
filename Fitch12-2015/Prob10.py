def main():
    for i in range(4):
        degree = int(input())
        coef = list(map(int, input().strip().split(" ")))
        startX = list(map(int, input().strip().split(" ")))
        x0 = startX[0]
        x1 = startX[1]
        tolerance = float(input())
        input()
        printed = False
        while not printed:
            m = (evaluate(coef, x1) - evaluate(coef, x0)) / (x1 - x0)
            b = evaluate(coef, x0) - (m * x0)
            x2 = -1 * (b / m)
            xm = (float(x0) + x1) / 2
            newX = list()
            newX.append(x0)
            newX.append(x1)
            newX.append(x2)
            newX.append(xm)
            newX.sort()
            yValues = list()
            for i in range(4):
                yValues.append(evaluate(coef, newX[i]))
            for i in range(3):
                if yValues[i] <= 0 and yValues[i + 1] >= 0 or yValues[i] >= 0 and yValues[i + 1] <= 0:
                    x0 = newX[i]
                    x1 = newX[i + 1]
                    if abs(x0 - x1) <= tolerance:
                        if(evaluate(coef, x0) == 0):
                            print(str(x0) + " " + str(x0))
                        elif(evaluate(coef, x1) == 0):
                            print(str(x1) + " " + str(x1))
                        else:
                            print(str(x0) + " " + str(x1))
                        printed = True
                    break

def evaluate(coef, x):
    output = 0
    for i in range(len(coef)):
        output += coef[i] * (x ** (len(coef) - i - 1))
    return float(output)

if __name__ == "__main__": main()
