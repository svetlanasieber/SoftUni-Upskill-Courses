# Read the floating-point number from user input
num = float(input())

# Determine and print the description of the number
if num == 0:
    print("zero")
else:
    descriptor = ""

    # Determine the size descriptor
    if abs(num) < 1:
        descriptor = "small "
    elif abs(num) > 1_000_000:
        descriptor = "large "

    # Determine the sign descriptor
    if num > 0:
        descriptor += "positive"
    else:
        descriptor += "negative"

    print(descriptor)
