def main():
    hand = list()
    handStr = ""
    for i in range(11):
        if i == 0:
            handStr = input()
            hand = handStr.split(", ")
        else:
            hand = handStr.split(", ")
            arr = input().split(", ")
            hand.reverse()
            for j in range(int(arr[0])):
                hand[j] = arr[1]
        hand.sort()
        count = 1
        satisfied = False
        cards = {}
        for j in range(len(hand)):
            if hand[j] in cards:
                cards[hand[j]] += 1
            else:
                cards[hand[j]] = 1

        for a, b in cards.items():
            if b >= 3:
                satisfied = True

        if satisfied:
            print(cards)
            groups = list()
            points = 0
            wildCards = 0
            for a, b in cards.items():
                if b >= 3 and a != "&" and a != "2":
                    group = [a] * 3
                    cards[a] -= 3
                    groups.append(group)
            for a, b in cards.items():
                if b >= 2 and a != "&" and a != "2":
                    group = [a] * 2
                    cards[a] -= 2
                    groups.append(group)
            for group in groups:
                if len(group) == 2:
                    if cards["&"] != 0:
                        group.append("&")
                        cards["&"] -= 1
                    elif cards["2"] != 0:
                        group.append("2")
                        cards["2"] -= 1

            while True:
                broken = False
                index = 0
                for group in groups:
                    if len(group) <= 2:
                        groups.remove(group)
                        broken = True
                        break
                    index += 1
                if not broken:
                    break


            for group in groups:
                points += calc(group)
            print(groups)
            print(points)

        else:
            print(0)

def calc(group):
    points = 0
    for i in group:
        if i == "4" or i == "5" or i == "6":
            points += 5
        elif i == "A" or i == "2":
            points += 20
        elif i == "&":
            points += 50
        else:
            points += 10
    return points

def numWilds(group):
    output = 0
    for i in group:
        if i == "&" or i == "2":
            output += 1
    return output

if __name__ == "__main__": main()

# A, 5, 9, T, K, A, 5, K, T, 5, &, 2, 2
