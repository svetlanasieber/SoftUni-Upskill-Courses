start_salary = float(input())
monthly_expenses = float(input())
monthly_salary_increase = float(input())
dream_car_price = float(input())
saving_months_count = int(input())

total_earned_salary = start_salary
current_salary = start_salary

for _ in range(1, saving_months_count):
    current_salary += monthly_salary_increase
    total_earned_salary += current_salary

final_savings = total_earned_salary - (monthly_expenses * saving_months_count)

if final_savings >= dream_car_price:
    print('Have a nice ride!')
else:
    print('Work harder!')