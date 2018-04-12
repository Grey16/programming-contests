from decimal import Decimal, ROUND_HALF_UP

def main():
    for i in range(4):
        arr = list(map(float, input().strip().split(" ")))
        n = sum(arr)
        answer = 36000/n
        print(Decimal(str(answer)).quantize(Decimal('0.000'), rounding=ROUND_HALF_UP))

if __name__ == "__main__": main()
