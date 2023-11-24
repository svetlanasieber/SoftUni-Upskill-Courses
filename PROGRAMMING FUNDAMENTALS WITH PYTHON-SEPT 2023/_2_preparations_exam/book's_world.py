
def main():
    genres = input().split('|')

    while True:
        command = input()
        if command == "Stop!":
            break

        tokens = command.split()
        action = tokens[0]

        if action == "Join":
            genre = tokens[1]
            if genre not in genres:
                genres.append(genre)

        elif action == "Drop":
            genre = tokens[1]
            if genre in genres:
                genres.remove(genre)

        elif action == "Replace":
            old_genre = tokens[1]
            new_genre = tokens[2]
            if old_genre in genres and new_genre not in genres:
                index = genres.index(old_genre)
                genres[index] = new_genre

        elif action == "Prefer":
            genre_index1 = int(tokens[1])
            genre_index2 = int(tokens[2])
            if 0 <= genre_index1 < len(genres) and 0 <= genre_index2 < len(genres):
                genres[genre_index1], genres[genre_index2] = genres[genre_index2], genres[genre_index1]

    print(' '.join(genres))


if __name__ == "__main__":
    main()
