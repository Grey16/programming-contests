def main():
    for i in range(1):
        x = input()
        player = x[:1]
        number = int(x[1:])
        alreadySeen = list()
        printed = False
        while not printed:
            if player == "A":
                if number % 2 == 1:
                    number -= 6
                # else:
                #     number /= 2
                if number < 12:
                    print("A will win.")
                    printed = True
                player = "B"
            else:
                # if number % 2 == 1:
                #     number += 4
                # else:
                #     number += 9
                if number in alreadySeen:
                    print("B will win.")
                    printed = True
                else:
                    alreadySeen.append(number)
                player = "A"

if __name__ == "__main__": main()
