def main():
    for i in range(4):
        s = int(input())
        printed = False
        base = 2
        while not printed:
            current = convert(base, s)
            try:
                result = int(current, base)
                if result < 2 ** 31:
                    print("base " + str(base) + " numeral is " + current + " decimal value is " + str(result))
                    printed = True
                else:
                    base += 1
            except:
                base += 1

def convert(b, s):
    result = ""
    if s % (b - 1) != 0:
        result += base(s % (b - 1))
    c = base(b - 1)
    for j in range(int(int(s) / int(b - 1))):
        result += c
    return result

def base(n):
    if n < 10:
        return str(n)
    else:
        return str(chr(n + 55))

if __name__ == "__main__": main()
