n = int(input())


def pascalTriangle(num):
    # Iterating through rows
    for n in range(1, num + 1):
        if num == n:
            to_print = []
            # iterating through each value of the row
            for k in range(0, n + 1):
                digit = factFormula(n, k)
                to_print.append([digit][0])
            print(*to_print, sep=" ")


def findFact(i):
    if i == 1 or i == 0:
        return 1
    else:
        return i * findFact(i - 1)


def factFormula(n, k):
    return int(findFact(n) / (findFact(n - k) * findFact(k)))


pascalTriangle(n)