initial_treasure_chest = input().split("|")
current_treasure_chest = initial_treasure_chest.copy()
full_command = input()
while not full_command == "Yohoho!":
    full_command = full_command.split()
    real_command = full_command[0]
    if real_command == "Loot":
        full_command.pop(0)
        looted_items = [
            item for item in full_command if item not in current_treasure_chest
        ]
        looted_items = looted_items[::-1]
        current_treasure_chest = looted_items + current_treasure_chest
    elif real_command == "Drop":
        index = int(full_command[1])
        if index in range(len(current_treasure_chest)):
            current_treasure_chest.append(current_treasure_chest[index])
            current_treasure_chest.pop(index)
    elif real_command == "Steal":
        count = int(full_command[1])
        stealed_items = []
        if count < len(current_treasure_chest):
            for i in range(count):
                stealed_items.append(current_treasure_chest[-1])
                current_treasure_chest.pop()
            stealed_items = stealed_items[::-1]
            print(*stealed_items, sep=", ")
        else:
            print(*current_treasure_chest, sep=", ")
            current_treasure_chest = []
    full_command = input()

if current_treasure_chest:
    sum_of_lenghts = 0
    for item in current_treasure_chest:
        sum_of_lenghts += len(item)
    print(
        f"Average treasure gain: {sum_of_lenghts / len(current_treasure_chest) :.2f} pirate credits."
    )
else:
    print("Failed treasure hunt.")
