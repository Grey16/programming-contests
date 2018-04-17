import math

def main():
    for i in range(4):
        arr = list(map(float, input().strip().split(" ")))
        a = arr[0]
        b = arr[1]
        c = arr[2]
        if a < b:
            temp = a
            a = b
            b = temp
        radian = math.asin((a - b) / c)
        answer = math.pi * (a + b) + 2 * (radian * a) - 2 * (radian * b) + 2 * (math.sqrt(c ** 2 - (a - b) ** 2))
        print(answer)

if __name__ == "__main__": main()
