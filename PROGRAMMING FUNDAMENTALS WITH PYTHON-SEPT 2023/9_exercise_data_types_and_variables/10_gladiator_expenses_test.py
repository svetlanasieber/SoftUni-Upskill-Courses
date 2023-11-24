def calculate_gladiator_expenses():
    # Input data
    lost_fights = int(input())
    helmet_price = float(input())
    sword_price = float(input())
    shield_price = float(input())
    armor_price = float(input())

    # Initialize variables
    expenses = 0.0
    shield_breaks = 0

    # Loop through each lost fight
    for fight in range(1, lost_fights + 1):
        helmet_broken = False
        sword_broken = False

        if fight % 2 == 0:  # helmet breaks every 2nd lost fight
            expenses += helmet_price
            helmet_broken = True
        if fight % 3 == 0:  # sword breaks every 3rd lost fight
            expenses += sword_price
            sword_broken = True

        # shield breaks when both sword and helmet break in the same fight
        if helmet_broken and sword_broken:
            expenses += shield_price
            shield_breaks += 1

        # armor needs repair every 2nd time the shield breaks
        if (
            shield_breaks % 2 == 0
            and shield_breaks != 0
            and helmet_broken
            and sword_broken
        ):
            expenses += armor_price

    # Print the result
    print(f"Gladiator expenses: {expenses:.2f} aureus")


# Execute the function
calculate_gladiator_expenses()
