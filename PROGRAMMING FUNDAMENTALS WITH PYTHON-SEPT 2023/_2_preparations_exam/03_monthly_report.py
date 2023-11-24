def distributor_money_spent(dist_list: list, dist_name: str, m_spent: float):
    # if distributors does not exist , add them and the money they spent
    is_distributor = False
    for distributor in dist_list:
        is_distributor = True
        # if one exist just add the money they spent
        if dist_name in distributor["distributor_name"]:
            distributor["money"] += m_spent
            break
        else:
            # if distributors does not exist add one to the list
            dist_list.append({"distributor_name": dist_name, "money": m_spent})
            break

    if not is_distributor:
        # if distributors is empty list
        dist_list.append({"distributor_name": dist_name, "money": m_spent})


def distributor_money_returned(dist_list: list, dist_name: str, m_returned: float):
    # you return ingredients and distributor give you back the spend money
    is_distributor = False
    for distributor in dist_list:
        is_distributor = True
        # if one exist just decrease the money of given distributor with given amount
        if dist_name in distributor["distributor_name"]:
            distributor["money"] -= m_returned

            # if the cost of ingredient become 0, you should remove the distributor
            if distributor["money"] <= 0:
                dist_list.remove("distributor")

            if distributor["money"] < m_returned:
                return
            break
    if not is_distributor:
        return


def add_client(clients: list, client_name: str, money_earned: float):
    # you return ingredients and distributor give you back the spend money
    is_client = False
    for client in clients:
        is_client = True
        # if one exist just decrease the money of given distributor with given amount
        if client_name in client["client_name"]:
            client["money_earned"] += money_earned
            break
        else:
            clients.append({"client_name": client_name, "money_earned": money_earned})
            break

    # if clients is empty list
    if not is_client:
        clients.append({"client_name": client_name, "money_earned": money_earned})


command = input()

distributors = []
clients = []
total_money_earned = 0

while not command == "End":
    command = command.split()

    if command[0] == "Deliver":
        distributor_name = command[1]
        money_spent = float(command[2])
        distributor_money_spent(distributors, distributor_name, money_spent)

    elif command[0] == "Return":
        distributor_name = command[1]
        money_returned = float(command[2])
        distributor_money_returned(distributors, distributor_name, money_returned)

    elif command[0] == "Sell":
        client_name = command[1]
        money_earned = float(command[2])
        add_client(clients, client_name, money_earned)

    command = input()


for client in clients:
    total_money_earned += client["money_earned"]
    print(f"{client['client_name']}: {client['money_earned']:.2f}")

print("-----------")

for distributor in distributors:
    print(f"{distributor['distributor_name']}: {distributor['money']:.2f}")

print("-----------")
print(f"Total Income: {total_money_earned:.2f}")

"".jo
