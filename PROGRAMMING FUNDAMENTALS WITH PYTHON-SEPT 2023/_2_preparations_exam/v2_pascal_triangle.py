def pascaltriagle(n):
    row = [1]
    y = [0]
    for x in range(n):
        if x == n - 1:
            print(*row)
        row = [left + right for left, right in zip(row + y, y + row)]
    return n > 1


n = int(input())
pascaltriagle(n + 1)

# 7
# 1 7 21 35 35 21 7 1