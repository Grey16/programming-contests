from decimal import Decimal, ROUND_HALF_UP

def main():
    for i in range(4):
        arr = list(map(float, input().strip().split(" ")))
        a = arr[0]
        b = arr[1]
        answer = (a * b) / (2 * a - b)
        print(Decimal(str(answer)).quantize(Decimal('0.0'), rounding=ROUND_HALF_UP))

if __name__ == "__main__": main()
