def custom_key(x):
    # Return a tuple where the first element is 0 for even numbers and 1 for odd numbers,
    # and the second element is the number itself to ensure ascending order.
    return (x % 2, x)

# Example input
numbers = [1, 2, 3, 4, 5, 6]

# Sort the numbers using the custom key
sorted_numbers = sorted(numbers, key=custom_key)

# Print the sorted numbers
print(" ".join(map(str, sorted_numbers)))
