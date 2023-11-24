from collections import deque

cards_count = int(input())
indexes = list(map(int, input().split()))
cards = [num for num in range(1, cards_count + 1)]


shuffled_deck = []
for i in indexes:
    first_half = deque(cards[:i])
    second_half = deque(cards[i:])

    while first_half or second_half:
        if first_half:
            shuffled_deck.append(first_half.popleft())
        if second_half:
            shuffled_deck.append(second_half.popleft())

    cards = shuffled_deck
    shuffled_deck = []

print(' '.join(map(str, cards)))