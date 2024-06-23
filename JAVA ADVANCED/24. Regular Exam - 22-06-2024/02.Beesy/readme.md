![image](https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/4b2bfc15-df29-4b92-b0ee-42d4dd64621a)

# Beesy

Bees are indispensable for maintaining the health of ecosystems, promoting biodiversity, supporting agriculture, and ensuring food availability for human populations worldwide. Protecting bee populations and their habitats is crucial for the well-being of both ecosystems and humanity.

## Program Description

This program simulates a bee's journey in a field to collect nectar and return to its hive. The simulation follows these rules:

1. **Field Initialization**:
   - The field is a square matrix of size `n` (n x n).
   - The bee (`B`) is placed at a random position in the field.
   - Flowers with nectar are placed at random positions, marked with single digits representing the amount of nectar.
   - The hive is placed at a random position, marked with `H`.
   - Empty positions are marked with `-`.

2. **Bee Movement**:
   - The bee starts with 15 units of energy.
   - Each move command decreases the bee's energy by 1 unit.
   - The bee needs to collect at least 30 units of nectar to make honey successfully.
   - Commands for the bee's movement are: "up", "down", "left", and "right".

3. **Movement Logic**:
   - If the bee moves out of the field's boundaries, it wraps around to the opposite side of the field.
   - If the bee moves to a flower, it collects the nectar and the flower disappears.
   - If the bee runs out of energy with less than 30 units of nectar, the program ends.
   - If the bee runs out of energy with at least 30 units of nectar, energy is restored by the difference between collected nectar and 30 units (only once).

4. **End Conditions**:
   - The program ends if the bee reaches the hive.
   - The program ends if the bee runs out of energy and cannot be restored.

## Input

- The first line contains an integer `n` representing the size of the field (2 ≤ n ≤ 10).
- The next `n` lines contain the values for each row of the matrix.
- After the matrix, each line contains a move command for the bee ("up", "down", "left", "right").

## Output

- If the bee reaches the hive with at least 30 units of nectar collected:
  - `Great job, Beesy! The hive is full. Energy left: {energy}`
- If the bee reaches the hive without collecting 30 units of nectar:
  - `Beesy did not manage to collect enough nectar.`
- If the bee runs out of energy before returning to the hive:
  - `This is the end! Beesy ran out of energy.`

- The final state of the matrix is printed, with the last known position of the bee marked with `B`.

## Constraints

- The size of the square matrix (field) will be between [2…10].
- Only the letters 'B' and 'H' will be present in the matrix.
- The flowers with nectar are represented by single positive digits between [0…9].
- There will always be enough commands to finish the program.

## Examples


<img width="355" alt="1-bees" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/5e8ff985-9b9d-42e5-a244-82fc0ed0ca16">

<img width="353" alt="2-bees" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/00f7afd5-9f96-4004-88cb-867870822832">

<img width="353" alt="3-bees" src="https://github.com/svetlanasieber/Software-Engineering--Path-SoftUni/assets/135451084/19c022ec-3a3c-4759-989f-c81f62c0ad5a">






 

