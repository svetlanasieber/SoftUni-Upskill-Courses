n = int(input())
width = n * 5
height = n * 4 + 2
headlines_count = n // 2

# headlines
for _ in range(headlines_count):
    print(f'{" " * n}{"#" * (width - 2*n)}{" " * n}')

# upper part
for i in range(height // 2):
    if i == 0 or i == height // 2 - 1:
        print(f'{"#" * n}{" " * (width - 2*n)}{"#" * n}')
    elif i % 2 == 1:
        print(f'{"#" * n} {"# " * ((width - 2*n)//2)}{"#" * n}')
    elif i % 2 == 0:
        print(f'{"#" * n}  {"# " * ((width - 2*n - 2)//2)} {"#" * n}')


# lower part
for i in range(height - headlines_count*2 - height // 2):
    if i % 2 == 0:
        print(f'{"#" * width}')
    else:
        print(f'{"#" * n} {"# " * ((width - 2 * n) // 2)}{"#" * n}')


# headlines
for _ in range(headlines_count):
    print(f'{" " * n}{"#" * (width - 2*n)}{" " * n}')