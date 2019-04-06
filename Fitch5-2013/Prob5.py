def main():
    for i in range(3):
        inArr = input().split(":")
        h = inArr[0]
        m = inArr[1]
        if int(h) > 11:
            if int(h) == 12:
                print(h + ":" + m + "PM")
            elif int(h) == 24:
                print("12:00AM")
            else:
                h = str(int(h) - 12)
                print(h + ":" + m + "PM")
        else:
            if int(h) == 0:
                print("12:" + m + "AM")
            else:
                print(h + ":" + m + "AM")

main()
