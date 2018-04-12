def main():
    for i in range(4):
        string = input()
        arr = list(string)
        arr = list(reversed(arr))
        print("".join(arr))

if __name__ == "__main__": main()
