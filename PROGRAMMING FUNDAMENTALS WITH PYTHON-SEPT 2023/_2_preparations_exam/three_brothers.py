def subtract_seq(seq1, seq2):

    result = seq1[:]
    for num in seq2:
        result.remove(num)
    return result

def recover_path(sums, target):
    path = []
    while target > 0:
        last_num = sums[target]
        path.append(last_num)
        target -=last_num
    return path

def is_splittable(sequence, target_sum, bins_number):
    possible_sums = {}
    possible_sums[0] = 0
    for number in sequence:
        for possible_sum in list(possible_sums.keys()):
            current_sum = possible_sum + number
            if current_sum < target_sum and current_sum not in possible_sums:
                possible_sums[current_sum] = number
            if current_sum == target_sum:
                if bins_number ==2:
                    return True
                possible_sums[current_sum] = number
                participants = recover_path(possible_sums,target_sum)
                non_participants = subtract_seq(sequence, participants)
                if is_splittable(non_participants,target_sum, bins_number - 1):
                    return True
    return False

BINS = 3
n = int(input())
for i in range(n):
    presents = [int(s) for s in input().split(" ")]
    s,r = divmod(sum(presents),BINS)
    if r == 0 and is_splittable(presents,s,BINS):
        print("Yes")
    else:
        print("No")
# A conflicting comment for git merge testing
# Comment for git merging