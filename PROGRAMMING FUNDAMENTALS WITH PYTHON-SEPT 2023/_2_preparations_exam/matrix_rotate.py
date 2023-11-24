# Python program to find maximum contiguous subarray

# Function to find the maximum contiguous subarray
from math import inf

maxint = inf

numbers = input().split()
numbers = [int(x) for x in numbers]


def maxSubArraySum(a, size):
    max_so_far = -maxint - 1
    max_ending_here = 0
    currentNum = None
    prev_nums = []

    for i in range(0, size):
        max_ending_here = max_ending_here + a[i]
        if a[i] > 0:
            prev_nums.append(i)
        if (max_so_far <= max_ending_here):
            max_so_far = max_ending_here

            currentNum = i

        if max_ending_here < 0:
            max_ending_here = 0

    return [max_so_far, prev_nums[0], currentNum]


# Driver function to check the above function
print(" ".join([str(x) for x in maxSubArraySum(numbers, len(numbers))]))