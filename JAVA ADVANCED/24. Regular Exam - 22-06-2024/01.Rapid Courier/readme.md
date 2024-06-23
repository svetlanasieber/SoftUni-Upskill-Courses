# Rapid Courier Delivery Service

Welcome to the **Rapid Courier** delivery service! This program helps you analyze the performance of your couriers in delivering packages.

## Program Description

The program processes a sequence of packages and couriers to determine how well your couriers are doing in delivering all the packages. The functionality is as follows:

1. **Input**: 
   - A sequence of integers representing the weights of packages to be delivered.
   - A sequence of integers representing the loading capacities of couriers.

2. **Processing**:
   - The program continues running while there are packages to deliver and couriers available.
   - It tracks the total weight of packages delivered by your couriers.
   - Compares the last package to the first courier and processes delivery based on their capacities.

3. **Delivery Logic**:
   - If the courier can deliver the package:
     - If the courier's capacity is greater than the weight of the package, reduce the courier's capacity by twice the package's weight.
       - If the new courier's capacity is positive, the courier moves to the back of the sequence with the updated capacity.
       - If the new capacity is zero or negative, remove the courier.
     - Add the weight of the package to the total delivered weight.
     - Remove the package from the sequence.
   - If the courier cannot deliver the package:
     - Subtract the courier's capacity from the package's weight.
     - Return the remaining weight to the sequence (on its initial position), and remove the courier.
     - Add the delivered portion of the package's weight to the total delivered weight.

## Input / Constraints

- On the first line, you will receive integers representing the weight of the packages to be delivered, separated by a single space.
- On the second line, you will receive integers representing the capacities of the couriers, separated by a single space.
- All given numbers will be valid integers in the range [0; 100].

## Output

The output of your program should be printed on the Console, on separate lines, formatted according to the following rules:

- At the end of the program, print the weight of the packages delivered:
  - `Total weight: {total_weight} kg`
- If all of the packages are delivered and there are no couriers left:
  - `Congratulations, all packages were delivered successfully by the couriers today.`
- If there are packages left but no more couriers available:
  - `Unfortunately, there are no more available couriers to deliver the following packages: {package1}, {package2}, (…), {packagen}`
  - Print the packages in their current order
- If there are couriers left but there are no more packages to deliver:
  - `Couriers are still on duty: {couriers1}, {couriers2}, (…), {couriersn} but there are no more packages to deliver.`
  - Print the couriers in their current order

## Example

<img width="362" alt="rapid_input" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/97672476-4e34-4d6d-bd77-4bfa11caed88">



