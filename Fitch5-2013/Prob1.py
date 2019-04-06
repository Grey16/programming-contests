import math

def main():
    for i in range(3):
        n = int(input())
        print(factor(n))

def factor(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return i
    return n

main()
