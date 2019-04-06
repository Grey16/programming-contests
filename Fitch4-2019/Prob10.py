import math
for i in range(3):
    n = int(input())
    counter = 1
    while True:
        if math.factorial(counter) == n:
            print(counter)
            break
        else:
            counter += 1
