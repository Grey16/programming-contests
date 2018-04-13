def main():
    for i in range(4):
        x = int(input())
        if x % 9 != 0:
            print(x % 9, end = "")
        for j in range(int(int(x) / int(9))):
            print(9, end = "")
        print("")

if __name__ == "__main__": main()
