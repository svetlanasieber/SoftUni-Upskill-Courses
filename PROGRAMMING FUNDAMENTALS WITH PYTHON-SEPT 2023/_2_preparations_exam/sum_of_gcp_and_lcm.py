n = int(input())
m = int(input())

gcp_n = [x for x in range(1, n + 1) if n % x == 0]
gcp_m = [x for x in range(1, m + 1) if m % x == 0]

number = ''

for i in gcp_n:
    for l in gcp_m:
        if i == l:
            number = i

num_n = n
num_m = m
list_n = [n]
list_m = [m]
lcm = ''
while True:
    if num_n in list_m:
        lcm = num_n
        break
    if num_m in list_n:
        lcm = num_m
        break
    num_n = num_n + n
    list_n.append(num_n)
    num_m = num_m + m
    list_m.append(num_m)

print(number + lcm)