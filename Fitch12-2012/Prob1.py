import math

def main():
    for i in range(4):
        arr = list(map(int, input().strip().split(" ")))
        a = arr[0]
        b = arr[1]
        if b < a:
            temp = b
            b = a
            a = temp
        if math.sqrt(a * a + b * b) == math.floor(math.sqrt(a * a + b * b)):
            print(int(math.sqrt(a * a + b * b)))
        elif math.sqrt(b * b - a * a) == math.floor(math.sqrt(b * b - a * a)):
            print(int(math.sqrt(b * b - a * a)))
        else:
            print("NO")

if __name__ == "__main__": main()
