def main():
    products = input().split('|')

    while True:
        command = input()
        if command == "Shop!":
            for idx, product in enumerate(products, 1):
                print(f"{idx}. {product}")
            break

        action = command.split('%')[0]
        items = command.split('%')[1:]

        if action == "Add":
            product = items[0]
            if product not in products:
                products.append(product)
            else:
                print("The product is already in the list.")

        elif action == "Important":
            product = items[0]
            if product in products:
                products.remove(product)
            products.insert(0, product)

        elif action == "Remove":
            product = items[0]
            if product in products:
                products.remove(product)
            else:
                print(f"Product {product} isn't in the list.")

        elif action == "Swap":
            product1, product2 = items
            if product1 in products and product2 in products:
                idx1, idx2 = products.index(product1), products.index(product2)
                products[idx1], products[idx2] = products[idx2], products[idx1]
            elif product1 not in products and product2 not in products:
                print(f"Product {product1} missing!")
                print(f"Product {product2} missing!")
            elif product1 not in products:
                print(f"Product {product1} missing!")
            else:
                print(f"Product {product2} missing!")

        elif action == "Reversed":
            products.reverse()

if __name__ == "__main__":
    main()
