def main():
    hand = list()
    handStr = ""
    for i in range(2):
        # handle input
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

        # create cards dict
        cards = {}
        for j in range(len(hand)):
            if hand[j] in cards:
                cards[hand[j]] += 1
            else:
                cards[hand[j]] = 1

        wildcards = ["&", "2"]
        # there is at least one group of 3 natural cards
        satisfied = False
        for a, b in cards.items():
            if b >= 3 and a not in wildcards and a != "A":
                satisfied = True

        if satisfied:
            print(cards)
            # groups of 3 or more cards
            groups = list()
            # create one group of 3 natural cards
            for a, b in cards.items():
                if b >= 3 and a not in wildcards and a != "A":
                    group = [a] * 3
                    cards[a] -= 3
                    groups.append(group)
                    break
            print("Created group of 3 nat cards " + str(groups))
            # form groups of 2 nat cards to pair w/wildcards
            for a, b in cards.items():
                if b >= 2 and a not in wildcards:
                    group = [a] * 2
                    cards[a] -= 2
                    groups.append(group)
            print("Created group of 2 nat cards " + str(groups))
            # place wildcards with card groups
            # first place them with groups of 2
            for group in groups:
                if len(group) == 2:
                    if "&" in cards and cards["&"] > 0:
                        group.append("&")
                        cards["&"] -= 1
                    elif "2" in cards and cards["2"] > 0:
                        group.append("2")
                        cards["2"] -= 1
            # then place remaining wildcards
            for group in groups:
                while numWilds(group) <= 2 and ("&" in cards and cards["&"] > 0 or "2" in cards and cards["2"] > 0):
                    if "&" in cards and cards["&"] > 0:
                        group.append("&")
                        cards["&"] -= 1
                    elif "2" in cards and cards["2"] > 0:
                        group.append("2")
                        cards["2"] -= 1
            print("Put wildcards " + str(groups))
            # place remaining natural cards in groups
            for a, b in cards.items():
                if b != 0:
                    for group in groups:
                        if a in group:
                            for j in range(b):
                                group.append(a)
                            cards[a] = 0
                            break
            print("Put remaining natural cards " + str(groups))
            # rearrange cards to get as small number of length-2 groups as possible
            while True:
                moved = False
                for group in groups:
                    if len(group) < 3:
                        char = group[0]
                        groups.remove(group)
                        moved = True
                        for g in groups:
                            if char in g:
                                g.append(group)
                        break
                if not moved:
                    break

            # check to see all groups are at least 3 long
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

            # calculate points
            points = 0
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
