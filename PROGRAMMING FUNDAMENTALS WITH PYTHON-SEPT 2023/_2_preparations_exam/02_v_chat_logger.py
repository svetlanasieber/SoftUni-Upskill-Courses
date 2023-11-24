def in_data(word, data_func):
    if word in data_func:
        return True


data = []

while True:
    command = input()
    if "end" in command:
        break

    command = command.split()
    if "Chat" in command:
        message = command[1]
        data.append(message)
    elif "Delete" in command:
        message = command[1]
        if in_data(message, data):
            data.remove(message)
    elif "Edit" in command:
        message, edited_version = command[1], command[2]
        if in_data(message, data):
            index = data.index(message)
            data[index] = edited_version
    elif "Pin" in command:
        message = command[1]
        if in_data(message, data):
            index = data.index(message)
            data.append(data.pop(index))
    elif "Spam" in command:
        data = data + [x for x in command[1:]]

print("\n".join(data))