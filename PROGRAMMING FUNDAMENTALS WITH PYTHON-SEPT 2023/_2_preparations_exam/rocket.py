import math

n = int(input())

width = n + 5
half_width = width//2
half_n = n // 2

print(f'{"_"*(width//2)}^{"_"*(width//2)}')
print(f'{"_"*(half_width-1)}/|\{"_"*(half_width-1)}')
print(f'{"_" * (half_width - 2)}/|||\{"_" * (half_width - 2)}')

for i in range(1, half_n +  1):
    print(f'{"_" * (half_n-i)}/{"."*i}|||{"."*i}\{"_" * (half_n - i)}')

for i in range(half_n -1, half_n +  1):
    print(f'{"_" * (half_n-i)}/{"."*i}|||{"."*i}\{"_" * (half_n - i)}')
    break






for i in range(0, n):
    print(f'{"_" * (half_width - 1)}|||{"_" * (half_width - 1)}')
print(f'{"_"*(half_width-1)}~~~{"_"*(half_width-1)}')
for i in range(0, (half_n)):
    print(f'{"_"*(half_n - i)}//{"."*i}!{"."*i}\\\{"_"*(half_n - i)}')