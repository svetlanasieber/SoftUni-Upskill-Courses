def plunder_calculation(days, daily_plunder, expected_plunder):
    total_plunder = 0

    for day in range(1, days + 1):
        total_plunder += daily_plunder

        # Every third day
        if day % 3 == 0:
            total_plunder += 0.5 * daily_plunder

        # Every fifth day
        if day % 5 == 0:
            total_plunder -= 0.3 * total_plunder

    # Check if the gained plunder is more or equal to the target
    if total_plunder >= expected_plunder:
        return f"Ahoy! {total_plunder:.2f} plunder gained."
    else:
        percentage = (total_plunder / expected_plunder) * 100
        return f"Collected only {percentage:.2f}% of the plunder."


# Input
days = int(input())
daily_plunder = int(input())
expected_plunder = float(input())

# Calculate and Output
print(plunder_calculation(days, daily_plunder, expected_plunder))
