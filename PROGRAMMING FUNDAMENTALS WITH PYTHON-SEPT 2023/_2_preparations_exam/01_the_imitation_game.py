# Initialize the encrypted message
encrypted_message = input()

# Loop to read and process each command
while True:
    # Read a command
    command_line = input()

    # If "Decode" is received, break the loop
    if command_line == "Decode":
        break

    # Split the command into its components
    parts = command_line.split("|")
    command = parts[0]

    # Perform the appropriate action based on the command
    if command == "Move":
        n = int(parts[1])
        encrypted_message = encrypted_message[n:] + encrypted_message[:n]
    elif command == "Insert":
        index = int(parts[1])
        value = parts[2]
        encrypted_message = (
            encrypted_message[:index] + value + encrypted_message[index:]
        )
    elif command == "ChangeAll":
        substring = parts[1]
        replacement = parts[2]
        encrypted_message = encrypted_message.replace(substring, replacement)

# Print the decrypted message
print(f"The decrypted message is: {encrypted_message}")
