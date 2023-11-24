initial_health = 100
initial_bitcoins = 0
current_health = initial_health
current_bitcoins = initial_bitcoins

rooms_as_list_by_couple = input().split("|")
current_room_number = 0
alive = True

for room in rooms_as_list_by_couple:
    current_room_number += 1
    current_room = room.split()
    command = current_room[0]
    number = int(current_room[1])
    if command == "potion":
        if current_health + number > 100:
            number = 100 - current_health
            current_health = 100
        else:
            current_health += number
        print(f"You healed for {number} hp.")
        print(f"Current health: {current_health} hp.")
    elif command == "chest":
        print(f"You found {number} bitcoins.")
        current_bitcoins += number
    else:
        if current_health - number > 0:
            current_health -= number
            print(f"You slayed {command}.")
        else:
            alive = False
            print(f"You died! Killed by {command}.")
            print(f"Best room: {current_room_number}")
            break

if alive:
    print("You've made it!")
    print(f"Bitcoins: {current_bitcoins}")
    print(f"Health: {current_health}")
