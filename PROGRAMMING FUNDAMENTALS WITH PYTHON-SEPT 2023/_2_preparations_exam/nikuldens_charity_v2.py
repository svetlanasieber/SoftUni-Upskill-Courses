def validate_indexes(first_index, second_index, text):
    if 0 <= first_index < len(text) and 0 <= second_index < len(text):
        return True
    return False


message = input()

line = input()
while not line == "Finish":
    tokens = line.split()
    command = tokens[0]

    if command == "Replace":
        curr_char = tokens[1]
        new_char = tokens[2]

        message = message.replace(curr_char, new_char)
        print(message)

    elif command == "Cut":
        start_index = int(tokens[1])
        end_index = int(tokens[2])

        if validate_indexes(start_index, end_index, message):
            message = message[:start_index] + message[end_index + 1:]
            print(message)
        else:
            print("Invalid indexes!")

    elif line == "Make Upper":
        message = message.upper()
        print(message)

    elif line == "Make Lower":
        message = message.lower()
        print(message)

    elif command == "Check":
        string = tokens[1]

        if string in message:
            print(f"Message contains {string}")
        else:
            print(f"Message doesn't contain {string}")

    elif command == "Sum":
        start_index = int(tokens[1])
        end_index = int(tokens[2])

        if validate_indexes(start_index, end_index, message):
            substring = message[start_index:end_index + 1]
            ascii_values = [ord(char) for char in substring]
            print(sum(ascii_values))
        else:
            print("Invalid indexes!")

    line = input()