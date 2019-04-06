for i in range(3):
    n = int(input())
    counter = 0
    while True:
        if 2 ** counter == n:
            print(counter + 1)
            break
        else:
            counter += 1
