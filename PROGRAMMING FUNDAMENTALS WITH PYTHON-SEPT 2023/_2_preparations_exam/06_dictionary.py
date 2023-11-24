input_text = input().split(" | ")

dictionary = {}
for words in input_text:
    text = words.split(": ")
    word = text[0]
    definition = text[1]
    if word not in dictionary:
        dictionary[word] = []
        dictionary[word].append(definition)
    else:
        dictionary[word].append(definition)

teacher_input_text = input().split(" | ")

command = input()
if command == "Test":
    for word in teacher_input_text:
        if word in dictionary:
            print(f"{word}:")
            for key, value in dictionary.items():
                if key == word:
                    for item in value:
                        print(f" -{item}")
if command == "Hand Over":
    print(" ".join(dictionary.keys()))