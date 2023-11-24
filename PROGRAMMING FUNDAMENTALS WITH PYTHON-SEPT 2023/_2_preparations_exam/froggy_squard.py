frogs = input().split()

while True:
    tokens = input().split()
    command = tokens[0]

    if command == "Join":
        name = tokens[1]
        frogs.append(name)

    elif command == "Jump":
        name = tokens[1]
        index = int(tokens[2])
        if 0 <= index < len(frogs):
            frogs.insert(index, name)

    elif command == "Dive":
        index = int(tokens[1])
        if 0 <= index < len(frogs):
            frogs.pop(index)

    elif command == "First":
        count = int(tokens[1])
        if count <= len(frogs):
            first_frogs = [frogs[i] for i in range(count)]
            print(" ".join(first_frogs))
        else:
            print(" ".join(frogs))

    elif command == "Last":
        count = int(tokens[1])
        if count <= len(frogs):
            last_frogs = [frogs[i] for i in range(len(frogs) - 1, len(frogs) - count - 1, -1)]
            print(" ".join(reversed(last_frogs)))
        else:
            print(" ".join(frogs))

    elif command == "Print":
        if tokens[1] == "Normal":
            print(f"Frogs: {' '.join(frogs)}")
            break
        elif tokens[1] == "Reversed":
            print(f"Frogs: {' '.join(reversed(frogs))}")
            break