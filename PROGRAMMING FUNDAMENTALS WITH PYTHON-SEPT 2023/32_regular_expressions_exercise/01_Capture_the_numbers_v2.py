import re


def extract_numbers(input_text):
    # Use regular expression to find all numbers in the input_text
    numbers = re.findall(r'\d+', input_text)
    return numbers


def main():
    extracted_numbers = []

    # Continue reading lines until an empty line is encountered
    while True:
        line = input()
        if not line:
            break

        # Extract numbers from the current line and extend the list
        extracted_numbers.extend(extract_numbers(line))

    # Print the extracted numbers separated by a single space
    print(' '.join(extracted_numbers))


if __name__ == "__main__":
    main()
