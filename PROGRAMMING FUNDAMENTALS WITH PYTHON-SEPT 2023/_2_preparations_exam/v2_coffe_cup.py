n = int(input())
name = input()
width = 3 * n + 6
height = 3 * n + 1

for i in range(n):
    print(' ' * n + '~ ~ ~')

print('=' * (width - 1))

name_place = height - ((n + 1) * 2 + 1)
for i in range(name_place):
    place_for_name = n // 2
    if i + 1 == place_for_name:
        the_print = '|' + '~' * n + name.upper() + '~' * n + '|'
        for_place = abs(len(the_print) - width)
        print(the_print + ' ' * (for_place - 1) + '|')
    else:
        the_print = '|' + '~' * n + '~' * len(name) + '~' * n + '|'
        for_place = abs(len(the_print) - width)
        print(the_print + ' ' * (for_place - 1) + '|')
print('=' * (width - 1))
large = len('|' + '~' * n + name + '~' * n + '|')
for k in range(n):
    print(k * ' ' + '\\' + '@' * (large - 2) + '/')
    large -= 2
print('-' * (width - 1))