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
    count = 0
    curr = 0
    while count < n:
        curr += 1
        if isPrime(curr):
            print(curr, end = "")
            count += 1
            if count != n:
                print(", ", end = "")
    print("")
