def process_coffee_commands(coffee_list, commands):
    for cmd in commands:
        if "Include" in cmd:
            coffee_name = cmd.split()[1]
            coffee_list.append(coffee_name)
        elif "Remove" in cmd:
            if "first" in cmd:
                num_to_remove = int(cmd.split()[2])
                del coffee_list[:num_to_remove]
            elif "last" in cmd:
                num_to_remove = int(cmd.split()[2])
                del coffee_list[-num_to_remove:]
        elif "Prefer" in cmd:
            index1, index2 = map(int, cmd.split()[1:])
            if 0 <= index1 < len(coffee_list) and 0 <= index2 < len(coffee_list):
                coffee_list[index1], coffee_list[index2] = coffee_list[index2], coffee_list[index1]
        elif "Reverse" in cmd:
            coffee_list = coffee_list[::-1]
    return coffee_list

# Input
coffee_list = input().split()
num_commands = int(input())
commands = [input() for _ in range(num_commands)]

# Processing
final_list = process_coffee_commands(coffee_list, commands)

# Output
print("Coffees:", ' '.join(final_list))
