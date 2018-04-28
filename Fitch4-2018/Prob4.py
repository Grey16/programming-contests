import math

def main():
    for i in range(4):
        n = int(input())
        for j in range(n - 1, 1, -1):
            if isPrime(j):
                print(str(j) + " ", end = "")
                break
        num = n + 1
        while True:
            if isPrime(num):
                print(num)
                break
            else:
                num += 1

def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

if __name__ == "__main__": main()
