from sys import maxsize

numbers = input().split()
numbers = [int(x) for x in numbers]
# Function to find the maximum contiguous subarray
# and print its starting and end index
def maxSubArraySum(numList, size):
    max_so_far = -maxsize - 1
    max_ending_here = 0
    start = 0
    end = 0
    s = 0

    for i in range(0, size):

        max_ending_here += numList[i]

        if max_so_far < max_ending_here:
            max_so_far = max_ending_here
            start = s
            end = i

        if max_ending_here <= 0:
            max_ending_here = 0
            s = i + 1

    print((max_so_far), end=" ")
    print((start), end=" ")
    print((end))


# Driver program to test maxSubArraySum
maxSubArraySum(numbers, len(numbers))