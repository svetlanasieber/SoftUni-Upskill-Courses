import math

n = int(input())
text = input().upper()


width = 3 * n + 6
height = 3 * n + 1

space = ' '

for i in range(0, n):
    print(f'{space*n}~ ~ ~')

print(f'{"="*(width - 1)}')
rows = n - 2
signature = math.floor(n/2)

for h in range(1, rows+1):
    if h == signature:
        print(f'|{"~" * n}{text}{"~" * n}|{space * (n -1)}|')
    else:print(f'|{"~" * ( n * 2 +4 ) }|{space * (n - 1) }|')


print(f'{"="*(width - 1)}')

counter = 0
for g in range(n+5, 5, -1):
    print(f'{space*counter}\{"@"*(g+n-counter -1)}/')
    counter += 1

print(f'{"-"*(width - 1) }')