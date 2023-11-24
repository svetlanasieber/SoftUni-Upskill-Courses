def process_commands():
    # Receive the old most favorite genres.
    genres = input().split(' | ')

    while True:
        command = input().split()

        # If the "Stop!" command is received, end the loop.
        if command[0] == "Stop!":
            break

        action = command[0]

        # Process the "Join" command.
        if action == "Join":
            genre = command[1]
            if genre not in genres:
                genres.append(genre)

        # Process the "Drop" command.
        elif action == "Drop":
            genre = command[1]
            if genre in genres:
                genres.remove(genre)

        # Process the "Replace" command.
        elif action == "Replace":
            old_genre, new_genre = command[1], command[2]
            if old_genre in genres and new_genre not in genres:
                index = genres.index(old_genre)
                genres[index] = new_genre

        # Process the "Prefer" command.
        elif action == "Prefer":
            index1, index2 = int(command[1]), int(command[2])
            if 0 <= index1 < len(genres) and 0 <= index2 < len(genres):
                genres[index1], genres[index2] = genres[index2], genres[index1]

    # Print the final list of genres.
    print(' '.join(genres))


# Call the function to process commands and print the results.
process_commands()
