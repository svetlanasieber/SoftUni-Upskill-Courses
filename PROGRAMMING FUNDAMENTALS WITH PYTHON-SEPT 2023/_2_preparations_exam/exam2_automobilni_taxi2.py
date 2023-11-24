vehicles = input().split(">>")

total_taxes_collected = 0

for item in vehicles:
    vehicle = item.split()
    initial_tax = 0
    car_type = vehicle[0]

    if car_type == "family":
        years = int(vehicle[1])
        kilometers = int(vehicle[2])
        initial_tax = 50
        tax_decrease = years * 5
        tax_increase = (kilometers // 3000) * 12
        total_tax = tax_increase + (initial_tax - tax_decrease)
        total_taxes_collected += total_tax

        print(f"A {car_type} car will pay {total_tax:.2f} euros in taxes.")

    elif car_type == "heavyDuty":
        years = int(vehicle[1])
        kilometers = int(vehicle[2])
        initial_tax = 80
        tax_decrease = years * 8
        tax_increase = (kilometers // 9000) * 14
        total_tax = tax_increase + (initial_tax - tax_decrease)
        total_taxes_collected += total_tax

        print(f"A {car_type} car will pay {total_tax:.2f} euros in taxes.")
    elif car_type == "sports":
        years = int(vehicle[1])
        kilometers = int(vehicle[2])
        initial_tax = 100
        tax_decrease = years * 9
        tax_increase = (kilometers // 2000) * 18
        total_tax = tax_increase + (initial_tax - tax_decrease)
        total_taxes_collected += total_tax

        print(f"A {car_type} car will pay {total_tax:.2f} euros in taxes.")
    else:
        print("Invalid car type.")

print(
    f"The National Revenue Agency will collect {total_taxes_collected:.2f} euros in taxes."
)
