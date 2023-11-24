items = [x for x in input().split(", ")]

while True:
    command = input()
    if command == "Craft!":
        break
    command_args = command.split(" - ")
    action, item = command_args[0], command_args[1]
    if action == "Collect":
        items.append(item) if item not in items else 0
    elif action == "Drop":
        items.remove(item) if item in items else 0
    elif action == "Combine Items":
        old_item, new_item = item.split(":")
        old_item_idx = items.index(old_item) if old_item in items else -1
        items.insert(old_item_idx + 1, new_item) if old_item_idx >= 0 else 0
    elif action == "Renew":
        item_idx = items.index(item) if item in items else -1
        items.append(items.pop(item_idx)) if item_idx >= 0 else 0

print(", ".join(items))
