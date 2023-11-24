n = int(input())
width = 5 * n
height = 2 * n + 3


# first line
print(f'{"." * ((width-n)//2)}{"*" * n}{"." * ((width-n)//2)}')


# first half - first half
for i in range(1, n//2+1):
    print(f'{"." * ((width-n-4*i)//2)}{"*" * i}{"+" * i}{"+" * n}{"+" * i}{"*" * i}{"." * ((width-n-4*i)//2)}')


# first half - second half
for i in range(1, n//2+1):
    print(f'{"." * (n-i)}**{"=" * (width-4-2*(n-i))}**{"." * (n-i)}')


# middle
print(f'{"." * (n//2)}**{"~" * ((width-16-n)//2)}HAPPY EASTER{"~" * ((width-16-n)//2)}**{"." * (n//2)}')


# second half - first half
for i in range(n//2, 0, -1):
    print(f'{"." * (n-i)}**{"=" * (width-4-2*(n-i))}**{"." * (n-i)}')


# second half - second half
for i in range(n//2, 0, -1):
    print(f'{"." * ((width-n-4*i)//2)}{"*" * i}{"+" * i}{"+" * n}{"+" * i}{"*" * i}{"." * ((width-n-4*i)//2)}')


# last line
print(f'{"." * ((width-n)//2)}{"*" * n}{"." * ((width-n)//2)}')