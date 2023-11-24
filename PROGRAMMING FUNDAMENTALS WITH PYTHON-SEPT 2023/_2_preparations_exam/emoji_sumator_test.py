import re

emoji_string = input()
special_emoji = list(map(chr, map(int, input().split(":"))))

special_word = "".join(special_emoji)

pattern = r'(?<=\s|^):([a-z]{4,}):(?=[\s,.?!])'
matches = re.findall(pattern, emoji_string)

only_emojis = [f":{match}:" for match in matches]
power = sum(sum(ord(c) for c in emoji) for emoji in matches)

if len(matches) > 0:
    print("Emojis found:", ",".join(only_emojis))

if special_word in matches:
    power *= 2

print("Total Emoji Power:", power)
