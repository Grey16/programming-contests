from decimal import Decimal, ROUND_HALF_UP

def main():
    for i in range(4):
        arr = list(map(float, input().strip().split(" ")))
        n = 3600 * 2.5 * ((arr[1] * arr[2] * arr[3]) + (arr[0] * arr[2] * arr[3]) + (arr[0] * arr[1] * arr[3]) + (arr[0] * arr[1] * arr[2]))
        d = arr[0] * arr[1] * arr[2] * arr[3]
        s = n / d
        print(s)
        print(str(int(s/60)) + ":" + str(Decimal(str(s % 60)).quantize(Decimal('0.0000'), rounding=ROUND_HALF_UP)))

if __name__ == "__main__": main()
