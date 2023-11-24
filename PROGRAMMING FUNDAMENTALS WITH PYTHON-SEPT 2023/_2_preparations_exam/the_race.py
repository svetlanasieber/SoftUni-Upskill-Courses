import re


def main():
    while True:
        input_str = input()
        pattern = r'^([\#\$\%\&\*])(?P<name>[a-zA-Z]+)(\1)(\=)(?P<length>\d+)(\!\!)(?P<geohash>.*)$'

        match = re.match(pattern, input_str)

        if match:
            name = match.group("name")
            length = int(match.group("length"))
            geohash = match.group("geohash")

            if len(geohash) == length:
                decrypted_geohash = ''.join(chr(ord(char) + length) for char in geohash)
                print(f"Coordinates found! {name} -> {decrypted_geohash}")
                break
            else:
                print("Nothing found!")
        else:
            print("Nothing found!")


if __name__ == "__main__":
    main()
