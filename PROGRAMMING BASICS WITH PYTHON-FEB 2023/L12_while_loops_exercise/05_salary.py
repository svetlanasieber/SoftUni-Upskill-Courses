n_tabs = int(input())
salary = int(input())

# Loop through each tab to check the website
for _ in range(n_tabs):
    website = input()
    if website == "Facebook":
        salary -= 150
    elif website == "Instagram":
        salary -= 100
    elif website == "Reddit":
        salary -= 50

    # Check if the salary is zero or negative, and if so, print a message and terminate the program
    if salary <= 0:
        print("You have lost your salary.")
        break
else:  # This will execute only if the loop wasn't broken (i.e., salary > 0)
    print(salary)