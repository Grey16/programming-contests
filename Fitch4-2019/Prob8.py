def isPrime(n):
    if n == 0 or n == 1:
        return False
    else:
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                return False
        return True

for i in range(3):
    n = int(input())
    upper = n + 1
    while isPrime(upper) == False:
        upper += 1
    lower = n - 1
    while isPrime(lower) == False:
        lower -= 1
    print(lower, upper)
