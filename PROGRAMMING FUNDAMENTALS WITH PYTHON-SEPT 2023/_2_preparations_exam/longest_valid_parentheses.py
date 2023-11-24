def maxlen(string):
    n = len(string)
    result = []
    result.append(-1)
    count = 0
    for i in range(n):
        if string[i] == '(':
            result.append(i)
        else:
            if len(result) != 0:
                result.pop()
            if len(result) != 0:
                count = max(count, i - result[len(result) - 1])
            else:
                result.append(i)
    return count


parentheses = input()
print(maxlen(parentheses))