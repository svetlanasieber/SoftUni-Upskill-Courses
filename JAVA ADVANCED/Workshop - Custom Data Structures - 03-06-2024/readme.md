# Java Advanced Workshop: Custom Data Structures Lab

## Overview
In this Java Advanced Workshop at Software University, we will be creating our own custom data structures—a `SmartArray` and a `CustomStack`. These structures will simulate the behavior of commonly used data structures with tailored functionalities.

### SmartArray
The `SmartArray` class mimics the functionality of a Java `ArrayList`, but is initially limited to handling integers. It supports the following operations:
- `add(int element)`: Adds the element to the end of the list.
- `get(int index)`: Returns the element at the specified index.
- `remove(int index)`: Removes the element at the specified index.
- `contains(int element)`: Checks if the element exists in the list.
- `add(int firstIndex, int secondIndex)`: Adds an element at a specific index, shifting subsequent elements right.
- `forEach(Consumer<Integer> consumer)`: Applies a consumer function to each element in the list.

#### Internal Methods
- `resize()`: Doubles the size of the array when capacity is reached.
- `shrink()`: Halves the size of the array if excessive space is present.
- `shiftLeft(int index)`: Shifts elements left post-deletion.
- `shiftRight(int index)`: Shifts elements right when inserting.

### CustomStack
The `CustomStack` class functions similar to the `Java ArrayDeque` and supports:
- `push(int element)`: Adds an element to the stack.
- `pop()`: Removes and returns the last added element.
- `peek()`: Returns the last element without removing it.
- `forEach(Consumer<Integer> consumer)`: Processes each element with the given consumer.

## Implementation Details

### SmartArray Implementation
1. **Initialization**:
   - Initial capacity set at 4, doubling as needed.
   - Private array `data[]` holds elements.
2. **Adding Elements**:
   - Resize the internal array when the current capacity is fully utilized.
3. **Element Retrieval and Removal**:
   - Check index bounds before access.
   - Implement index shifting post-removal to maintain order.

### CustomStack Implementation
1. **Stack Operations**:
   - `push`, `pop`, and `peek` implement standard stack operations.
2. **Capacity Management**:
   - Like `SmartArray`, starts with an initial capacity of 4, resizing as necessary.



## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---

*Note: This README is for educational purposes and part of the Java Advanced course at Software University.*

