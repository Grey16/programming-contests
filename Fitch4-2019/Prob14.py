for i in range(3):
    arr = input().split("#")
    start = arr[0]
    final = arr[1]
    string = arr[-1]
    dfa = [[] for i in range((ord(final) - ord(start) + 1))]
    for j in range(2, len(arr) - 1, 1):
        dfa[ord(arr[j][0]) - 97].append(arr[j])

    result = ""
    state = start
    for j in range(len(string)):
        # go to correct state
        stateArr = dfa[ord(state) - 97]
        # check which rule needs to be followed
        target = string[j]
        nextStateFound = False
        for h in range(len(stateArr)):
            # go to next state
            if target in stateArr[h]:
                state = stateArr[h][2]
                nextStateFound = True
                break
        # if there is no applicable rule, false
        if nextStateFound == False:
            result = "no"
            break
        # if last part of string is not at end state, false
        if j == len(string) - 1:
            if state != final:
                result = "no"
                break
            else:
                result = "yes"
                break
    print(result)

# a#c#a0a#a1b#b0c#b1a#c0b#c1c#111
# a#c#a0a#a1b#b0c#b1a#c0b#c1c#1110
# a#a#a1a#a0a#1010
