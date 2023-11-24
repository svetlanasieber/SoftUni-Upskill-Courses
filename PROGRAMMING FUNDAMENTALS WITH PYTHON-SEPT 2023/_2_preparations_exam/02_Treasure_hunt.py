treasure_items = [x for x in input().split("|")]

line = input()
while line != "Yohoho!":
    command, *tokens = line.split()
    if command == "Loot":
        for item in tokens:
            treasure_items.insert(0, item) if item not in treasure_items else None
    elif command == "Drop":
        index = int(tokens[0])
        treasure_items.append(treasure_items.pop(index)) if 0 <= index < len(
            treasure_items
        ) else None
    elif command == "Steal":
        count = int(tokens[0])
        stolen_items = [
            treasure_items.pop() for _ in range(min(len(treasure_items), count))
        ]
        print(*stolen_items[::-1], sep=", ")

    line = input()

if treasure_items:
    average_treasure_gain = sum([len(x) for x in treasure_items]) / len(treasure_items)
    print(f"Average treasure gain: {average_treasure_gain:.2f} pirate credits.")
else:
    print("Failed treasure hunt.")
