def main():
    for i in range(4):
        s = list(input())
        if len(s) == 1:
            print("1" + s[0], end = "")
        else:
            counter = 1
            for j in range(1, len(s)):
                if s[j] == s[j - 1]:
                    counter += 1
                    if j == len(s) - 1:
                        print(str(counter) + s[j])
                else:
                    print(str(counter) + s[j - 1], end = "")
                    if j == len(s) - 1:
                        print("1" + s[j])
                    counter = 1

if __name__ == "__main__": main()
