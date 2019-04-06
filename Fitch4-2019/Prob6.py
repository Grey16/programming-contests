for i in range(3):
    n = int(input())
    count = 1
    curr = n
    while curr > 3:
        curr = curr // 3
        count += 1
    print(count)
