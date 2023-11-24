# Преминете през всеки ден от приключението.
# На всеки 10-и ден двама спътници напускат групата.
# На всеки 15-и ден към групата се присъединяват 5 спътника.
# Всеки ден печелите по 50 монети, но също така харчите
# по 2 монети на спътник за храна.
# На всеки 3-ти ден харчете по 3 монети на спътник за мотивационно парти.
# На всеки 5-и ден печелите по 20 монети на спътник, като убивате чудовище-бос.
# Ако това е и ден, в който имате мотивационно парти,
# похарчете допълнително по 2 монети на спътник.
# Накрая разделете общия брой монети на размера на групата,
# за да получите монети на спътник.

# Loop through each day of the adventure.
# For every 10th day, 2 companions leave the group.
# For every 15th day, 5 companions join the group.
# Every day, you earn 50 coins but also spend 2 coins per companion on food.
# Every 3rd day, spend 3 coins per companion on a motivational party.
# Every 5th day, earn 20 coins per companion by slaying a boss monster.
# If this is also a day when you have a motivational party,
# spend an additional 2 coins per companion.
# At the end, divide the total coins by the group size to get the coins per companion.


def calculate_party_profit(group_size, days):
    total_coins = 0

    for day in range(1, days + 1):
        # Check for the 10th and 15th day companions update
        if day % 10 == 0:
            group_size -= 2
        if day % 15 == 0:
            group_size += 5

        # Calculate the daily earnings and expenses
        total_coins += 50
        total_coins -= group_size * 2  # Food cost

        if day % 3 == 0:  # Motivational party
            total_coins -= group_size * 3  # Water cost

        if day % 5 == 0:  # Slaying a boss monster
            total_coins += group_size * 20
            if day % 3 == 0:  # If there's also a motivational party
                total_coins -= group_size * 2  # Additional cost

    coins_per_companion = total_coins // group_size
    return f"{group_size} companions received {coins_per_companion} coins each."


# Take user input and display the result
group_size = int(input())
days = int(input())

print(calculate_party_profit(group_size, days))
