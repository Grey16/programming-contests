for i in range(3):
    string = input()
    longest = -1
    for j in range(len(string) + 1):
        for h in range(len(string) + 1):
            try:
                temp = string[j:h]
                if temp == temp[::-1]:
                    if len(temp) > longest:
                        longest = len(temp)
            except:
                continue
    if longest <= 1:
        longest = -1
    print(longest)

# 123440445
# 111722522723
# 1342
